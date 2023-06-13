package com.san.arrays;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test13 {

	public static void main(String[] args) {
		
//		String name = "RTR - 07/19/2022.docx";
//		
//		String timestamp = "2023-01-25 06:00:24.947Z";
		
//		DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
//        LocalDate date = LocalDate.parse(timestamp, formatter);
//        System.out.println("Date: " + date);
        
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        LocalDate date = LocalDate.parse(timestamp, formatter);
//        System.out.println("Date: " + date);
		
		
		
		Dummy dummy = new Dummy();
		//dummy.setName("ON_HOLD");
		
		dummy = null;
		
		if(dummy == null || (dummy.getName().equals("ON_HOLD"))) {
			System.out.println("Cotinuing");
		}else {
			System.out.println("Working");
		}
		
		
		
		
		
	}
}
