package com.san.arrays;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.formula.EvaluationWorkbook;
import org.apache.poi.xssf.usermodel.BaseXSSFEvaluationWorkbook;
import org.apache.poi.xssf.usermodel.XSSFEvaluationWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadExternalReferenceV4 {

	public static void main(String[] args) {
		
		
		try {
			File f = new File("C:\\Users\\Santosh\\Downloads\\2021 Plan Summary - change vs. Oct.xlsx");
			 f.isDirectory();
			 System.out.println(f.getCanonicalPath());
			 InputStream inputStream = new FileInputStream(f);

				ByteArrayOutputStream baos = new ByteArrayOutputStream();

				byte[] buffer = new byte[1024];
				int len;
				while ((len = inputStream.read(buffer)) > -1 ) {
					baos.write(buffer, 0, len);
				}
				baos.flush();
				
				XSSFWorkbook wb = new XSSFWorkbook(new ByteArrayInputStream(baos.toByteArray()));
	
				//BaseXSSFEvaluationWorkbook
				BaseXSSFEvaluationWorkbook evalWorkbook = XSSFEvaluationWorkbook.create( wb);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		
	}
}
