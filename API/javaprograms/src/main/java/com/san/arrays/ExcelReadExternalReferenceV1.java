package com.san.arrays;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.openxml4j.opc.PackageRelationshipCollection;
import org.apache.poi.ss.formula.EvaluationCell;
import org.apache.poi.ss.formula.EvaluationSheet;
import org.apache.poi.ss.formula.ptg.Ptg;
import org.apache.poi.ss.formula.ptg.Ref3DPxg;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.model.ExternalLinksTable;
import org.apache.poi.xssf.usermodel.BaseXSSFEvaluationWorkbook;
import org.apache.poi.xssf.usermodel.XSSFEvaluationWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRelation;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadExternalReferenceV1 {

	public static void main(String[] args) {

		try {
			String filePath = "C:\\Users\\Santosh\\Downloads\\2021 Plan Summary - change vs. Oct.xlsx";
			
			Workbook workbook = WorkbookFactory.create(new FileInputStream(filePath));
			Map<String, String> dataMap = new HashMap<String, String>();
			List<String> formulaList = new ArrayList<String>();
			List<String> finalFormulaList = new ArrayList<String>();
			BaseXSSFEvaluationWorkbook evalWorkbook = null;
			if (workbook instanceof XSSFWorkbook) {
				evalWorkbook = XSSFEvaluationWorkbook.create((XSSFWorkbook) workbook);
			}

		//	getReferencedWorkbooksXssfV3((XSSFWorkbook)workbook);
			List<ExternalLinksTable> externalLinksTableList = getReferencedWorkbooksXssfV2((XSSFWorkbook)workbook);
			
			Sheet sheet = workbook.getSheetAt(0);
			EvaluationSheet evalSheet = evalWorkbook.getSheet(0);
		
		
		
			for (Row row : sheet) {
				for (Cell cell : row) {
					if (cell.getCellType() == CellType.FORMULA && cell.getCellFormula().contains("[")) {
						// System.out.println(cell.getStringCellValue());
						String cellFormula = cell.getCellFormula();
						
						
						
						EvaluationCell evaluationCell = evalSheet.getCell(cell.getRowIndex(), cell.getColumnIndex());
						Ptg[] formulaTokens = evalWorkbook.getFormulaTokens(evaluationCell);
						for (Ptg formulaToken : formulaTokens) {

							if (formulaToken instanceof Ref3DPxg) {
								XSSFWorkbook	wb =(XSSFWorkbook)workbook;

								Ref3DPxg pxg = (Ref3DPxg) formulaToken;
								int extWB = pxg.getExternalWorkbookNumber();
								int extLink = extWB - 1;
								ExternalLinksTable links = externalLinksTableList.get(extLink);
								String filename = links.getLinkedFileName();
								formulaList.add(cellFormula);
								dataMap.put("["+(StringUtils.substringBetween(cellFormula, "[", "]"))+"]", filename);
							}

						}
					}
				}
			}
			
			for(String formula : formulaList) {
				String key = "["+(StringUtils.substringBetween(formula, "[", "]"))+"]";
				String value = "C:"+dataMap.get(key);
				formula = formula.replace(key, value);
				finalFormulaList.add(formula);
			
			}
			
			
			System.out.println(finalFormulaList);
			System.out.println(dataMap);
			System.out.println(finalFormulaList.size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

	private static List<ExternalLinksTable> getReferencedWorkbooksXssfV2(XSSFWorkbook workbook) throws OpenXML4JException {
		final List<ExternalLinksTable> externalLinksTable = workbook.getExternalLinksTable();
		return externalLinksTable;
	}
	
	
	private static void getReferencedWorkbooksXssfV3(XSSFWorkbook wb) throws InvalidFormatException {
		
		if(wb!=null){
			Iterator<Sheet> itr = wb.iterator();
			while(itr!=null && itr.hasNext()){
				Sheet sheet = itr.next();
				if(sheet!=null) {
					
					  if(sheet instanceof XSSFSheet) {
						  PackageRelationshipCollection pkgRlCl =   ((XSSFSheet)sheet).getPackagePart().getRelationshipsByType(XSSFRelation.EXTERNAL_LINKS.getRelation());

								  PackageRelationship relationship = ((XSSFSheet) sheet).getPackagePart().getRelationship("r1d1");
						  if(pkgRlCl!=null && pkgRlCl.size()>0) {
							  Iterator<PackageRelationship> pkItr =   pkgRlCl.iterator();
							  while(pkItr!=null && pkItr.hasNext()) {
								  PackageRelationship rel =   pkItr.next();
								
							  }
						  }
					  }
				}
			}
		}

		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
