package com.san.arrays;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test12 {

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		long start = System.currentTimeMillis();
		System.out.println(start+"--started--");
		Workbook workbook = WorkbookFactory.create(new FileInputStream(new File("C:\\Users\\Santosh\\Desktop\\INDEXES\\SAX\\Test.xlsx")));
		int numberOfSheets = workbook.getNumberOfSheets();
		workbook.removeSheetAt(numberOfSheets-1);
		  // Write the changes back to the file
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Santosh\\Desktop\\INDEXES\\SAX\\Test.xlsx");
        workbook.write(outputStream);
        outputStream.close();
        
        long end = System.currentTimeMillis();
		System.out.println(start+"--End--");
		
		System.out.println("Time taken in seconds : "+getSeconds(end-start));
	}
	
	private static long getSeconds(long millis) {
		return (millis / 1000) % 60;
	}
}

