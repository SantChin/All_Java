package com.san.arrays;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;



public class Test10 {

	
	public static void main(String[] args) throws BiffException, IOException, WriteException {
		long start = System.currentTimeMillis();
		System.out.println(start+"--started--");
		Workbook workbook = Workbook.getWorkbook(new File("C:\\Users\\Santosh\\Desktop\\INDEXES\\SAX\\Test.xlsx"));
		 // Create a writable copy of the workbook
        WritableWorkbook writableWorkbook = Workbook.createWorkbook(new FileOutputStream("C:\\Users\\Santosh\\Desktop\\INDEXES\\SAX\\modified_workbook.xlsx"), workbook);
		int numberOfSheets = writableWorkbook.getNumberOfSheets();
		writableWorkbook.removeSheet(numberOfSheets-1);
		writableWorkbook.write();
		writableWorkbook.close();
		
		long end = System.currentTimeMillis();
		System.out.println(start+"--End--");
		
		System.out.println("Time taken in seconds : "+getSeconds(end-start));
	}
	
	
	private static long getSeconds(long millis) {
		return (millis / 1000) % 60;
	}
}
