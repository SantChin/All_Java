package com.san.arrays;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test11 {

	
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		
		//extractedSxxsx();
		
		long start = System.currentTimeMillis();
		System.out.println(start+"--started--");
		Workbook workbook = WorkbookFactory.create(new FileInputStream(new File("C:\\Users\\Santosh\\Desktop\\INDEXES\\SAX\\Test.xlsx")));
		int numberOfSheets = workbook.getNumberOfSheets();
		workbook.removeSheetAt(numberOfSheets-1);
		  // Write the changes back to the file
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Santosh\\Desktop\\INDEXES\\SAX\\Test.xlsx");
        workbook.write(outputStream);
        outputStream.close();
        //workbook.close();
        long end = System.currentTimeMillis();
		System.out.println(start+"--End--");
		
		System.out.println("Time taken in seconds : "+getSeconds(end-start));
	}
	
	private static long getSeconds(long millis) {
		return (millis / 1000) % 60;
	}
	
	
	private static void extractedSxxsx() {
        try {
            //System.gc();
            long _start = System.currentTimeMillis();
            System.out.println(_start+"--started--");
            SXSSFWorkbook workbook2 = new SXSSFWorkbook(new XSSFWorkbook(new File("C:\\Users\\Santosh\\Desktop\\INDEXES\\SAX\\Test.xlsx")),1);
            System.out.println((System.currentTimeMillis()-_start)+"-Apache ended reading -Ended--");
            int totalShetts = workbook2.getXSSFWorkbook().getCTWorkbook().getSheets().sizeOfSheetArray();
            workbook2.getXSSFWorkbook().getCTWorkbook().getSheets().removeSheet(totalShetts-1);
             //workbook2.getSheetAt(22).;
            //System.out.println("---total sheets in apache poi--"+totalShetts);
//                workbook2.getCTWorkbook().getSheets().removeSheet(totalShetts-1);
//                int _totalShetts = workbook2.getCTWorkbook().getSheets().getSheetList().size();
//                System.out.println("---total sheets in apache poi--"+_totalShetts);
            workbook2.write(new FileOutputStream(new File("C:\\Users\\Santosh\\Desktop\\INDEXES\\SAX\\Test_1.xlsx")));
            System.out.println(" done ");
            //workbook2.close();
            System.gc();
            System.out.println(getSeconds(System.currentTimeMillis()-_start)+"-Apache ended-Ended--");

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
