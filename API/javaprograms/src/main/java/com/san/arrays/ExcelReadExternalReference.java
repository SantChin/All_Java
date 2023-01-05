package com.san.arrays;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFEvaluationWorkbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.formula.EvaluationCell;
import org.apache.poi.ss.formula.EvaluationSheet;
import org.apache.poi.ss.formula.EvaluationWorkbook;
import org.apache.poi.ss.formula.EvaluationWorkbook.ExternalSheet;
import org.apache.poi.ss.formula.ptg.Area3DPtg;
import org.apache.poi.ss.formula.ptg.Ptg;
import org.apache.poi.ss.formula.ptg.Ref3DPtg;
import org.apache.poi.ss.formula.ptg.Ref3DPxg;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.model.ExternalLinksTable;
import org.apache.poi.xssf.usermodel.XSSFEvaluationWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadExternalReference {
    public static void main(String[] args) throws Exception {

        String filePath = "C:\\Users\\Santosh\\Downloads\\2021 Plan Summary - change vs. Oct.xlsx";
        // String filePath = "TestExternalLinks.xls";

        Workbook workbook = WorkbookFactory.create(new FileInputStream(filePath));
        
        Map<String,String> dataMap =new  HashMap<String, String>();

        EvaluationWorkbook evalWorkbook = null;
        if (workbook instanceof HSSFWorkbook) {
            evalWorkbook = HSSFEvaluationWorkbook.create((HSSFWorkbook) workbook);
        } else if (workbook instanceof XSSFWorkbook) {
            evalWorkbook = XSSFEvaluationWorkbook.create((XSSFWorkbook) workbook);
        }
      //  getReferencedWorkbooksXssf((XSSFWorkbook)workbook);
        Sheet sheet = workbook.getSheetAt(0);
        EvaluationSheet evalSheet = evalWorkbook.getSheet(0);

        for (Row row : sheet) {
            for (Cell cell : row) {
                if (cell.getCellType() == CellType.FORMULA&& cell.getCellFormula().contains("[")) {
                	//System.out.println(cell.getStringCellValue());
                    String cellFormula = cell.getCellFormula();
                    System.out.println(cellFormula);

                    EvaluationCell evaluationCell = evalSheet.getCell(cell.getRowIndex(), cell.getColumnIndex());
                    Ptg[] formulaTokens = evalWorkbook.getFormulaTokens(evaluationCell);
                    for (Ptg formulaToken : formulaTokens) {
                        int externalSheetIndex = -1;
                
                        if(formulaToken instanceof Ref3DPxg){
                        	workbook = (XSSFWorkbook)workbook;
                        	 Ref3DPxg pxg = (Ref3DPxg)formulaToken;
                        	   int extWB = pxg.getExternalWorkbookNumber();
                        	   int extLink = extWB-1;
                        	   ExternalLinksTable links = ((XSSFWorkbook) workbook).getExternalLinksTable().get(extLink);
                        	  String filename = links.getLinkedFileName();
                        	 // System.out.println(filename);
                        	  dataMap.put(StringUtils.substringBetween(cellFormula, "[", "]"), filename);
                        	  
                        	}                    
                        if (formulaToken instanceof Ref3DPtg) {
                            Ref3DPtg refToken = (Ref3DPtg) formulaToken;
                            externalSheetIndex = refToken.getExternSheetIndex();
                        } else if (formulaToken instanceof Area3DPtg) {
                            Area3DPtg refToken = (Area3DPtg) formulaToken;
                            externalSheetIndex = refToken.getExternSheetIndex();
                        } else if (formulaToken instanceof Ref3DPtg) {
                            Ref3DPtg refToken = (Ref3DPtg) formulaToken;
                           // externalSheetIndex = refToken.
                        } else if (formulaToken instanceof Area3DPtg) {
                            Area3DPtg refToken = (Area3DPtg) formulaToken;
                          //  externalSheetIndex = refToken.getExternalWorkbookNumber();
                        }
                        
                      //  System.out.println(formulaToken.toFormulaString());

                        if (externalSheetIndex >= 0) {
                            System.out.print("We have extrenal sheet index: " + externalSheetIndex
                                    + ". So this formula refers an external sheet in workbook: ");

                            ExternalSheet externalSheet = null;
                            if (workbook instanceof HSSFWorkbook) {
                              //  externalSheet = evalWorkbook.getExternalSheet(externalSheetIndex);
                            } else if (workbook instanceof XSSFWorkbook) {
                               // externalSheet = evalWorkbook.getExternalSheet( externalSheetIndex);
                            }
                           // String linkedFileName = externalSheet.getWorkbookName();
                           // System.out.println(linkedFileName);

                        }
                    }
                }
            }
        }
        
        System.out.println(dataMap.toString());

       // ((FileInputStream) workbook).close();
    }
    
    
    private static Set<String> getReferencedWorkbooks(Workbook workbook) {
        Set<String> workbookNames = new HashSet<>();
        final EvaluationWorkbook evalWorkbook;
        if (workbook instanceof HSSFWorkbook) {
            evalWorkbook = HSSFEvaluationWorkbook.create((HSSFWorkbook) workbook);
        } else if (workbook instanceof XSSFWorkbook) {
            evalWorkbook = XSSFEvaluationWorkbook.create((XSSFWorkbook) workbook);
        } else {
            throw new IllegalStateException();
        }
        for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
            Sheet sheet = workbook.getSheetAt(i);
            final EvaluationSheet evalSheet = evalWorkbook.getSheet(i);
            for (Row r : sheet) {
                for (Cell c : r) {
                    if (c.getCellType() ==CellType.FORMULA) {
                        final EvaluationCell cell = evalSheet.getCell(c.getRowIndex(), c.getColumnIndex());
                        final Ptg[] formulaTokens = evalWorkbook.getFormulaTokens(cell);
                        for (Ptg formulaToken : formulaTokens) {
                            final int externalSheetIndex;
                            if (formulaToken instanceof Ref3DPtg) {
                                Ref3DPtg refToken = (Ref3DPtg) formulaToken;
                                externalSheetIndex = refToken.getExternSheetIndex();
                            } else if (formulaToken instanceof Ref3DPxg) {
                                Ref3DPxg refToken = (Ref3DPxg) formulaToken;
                                externalSheetIndex = refToken.getExternalWorkbookNumber();
                            } else {
                                externalSheetIndex = -1;
                            }

                            if (externalSheetIndex >= 0) {
                                final ExternalSheet externalSheet = evalWorkbook.getExternalSheet(externalSheetIndex);
                                workbookNames.add(externalSheet.getWorkbookName());
                            }
                        }
                    }
                }
            }
        }
        return workbookNames;
    }
    
    private static Set<String> getReferencedWorkbooksXssf(XSSFWorkbook workbook) {
        Set<String> workbookNames = new HashSet<>();
        Map<String,String> dataMap =new  HashMap<String, String>();
        final List<ExternalLinksTable> externalLinksTable = workbook.getExternalLinksTable();
        for (ExternalLinksTable linksTable : externalLinksTable) {
            final String linkedFileName = linksTable.getLinkedFileName();
            workbookNames.add(linkedFileName);
        }
        return workbookNames;
    }

}