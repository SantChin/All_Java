import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFEvaluationWorkbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.formula.EvaluationCell;
import org.apache.poi.ss.formula.EvaluationSheet;
import org.apache.poi.ss.formula.EvaluationWorkbook;
import org.apache.poi.ss.formula.EvaluationWorkbook.ExternalSheet;
import org.apache.poi.ss.formula.ptg.Ptg;
import org.apache.poi.ss.formula.ptg.Ref3DPtg;
import org.apache.poi.ss.formula.ptg.Ref3DPxg;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFEvaluationWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadExternalReferenceV3 {

	public static void main(String[] args) {
		
		try {
			String filePath = "C:\\Users\\Santosh\\Downloads\\2021 Plan Summary - change vs. Oct.xlsx";
			
			Workbook workbook = WorkbookFactory.create(new FileInputStream(filePath));
			Set<String> referencedWorkbooks = getReferencedWorkbooks(workbook);
			System.out.println(referencedWorkbooks);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	
	private static Set<String> getReferencedWorkbooks(Workbook workbook) {
	    Set<String> workbookNames = new HashSet<>();
	    final EvaluationWorkbook evalWorkbook;
	    if (workbook instanceof XSSFWorkbook) {
	        evalWorkbook = XSSFEvaluationWorkbook.create((XSSFWorkbook) workbook);
	    } else {
	        throw new IllegalStateException();
	    }
	    for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
	        Sheet sheet = workbook.getSheetAt(i);
	        final EvaluationSheet evalSheet = evalWorkbook.getSheet(i);
	        for (Row r : sheet) {
	            for (Cell c : r) {
	                if (c.getCellType() == CellType.FORMULA) {
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
}
