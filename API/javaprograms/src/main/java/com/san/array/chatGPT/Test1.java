package com.san.array.chatGPT;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test1 {

	public static void main(String[] args) throws ParseException {
		
		String inputDate = "Mon Jan 23 07:09:17 IST 2023";
		
		String outputFormat = "yyyy-MM-dd";

//		SimpleDateFormat inputFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
//		SimpleDateFormat outputFormat1 = new SimpleDateFormat(outputFormat);
//
//		Date date = (Date) inputFormat.parse(inputDate);
//		String outputDate = outputFormat1.format(date);
//
//		System.out.println(outputDate); //2023-01-23
		
		
		getOnlyDate(inputDate);
	}
	
	
	public static void getOnlyDate(String dateString) {
		DateTimeFormatter originalFormat = DateTimeFormatter.ofPattern("E MMM dd HH:mm:ss z uuuu");
		DateTimeFormatter newFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		  LocalDate date = LocalDate.parse(dateString.toString(), originalFormat);
	      String newDateString = date.format(newFormat);
	     System.out.println(newDateString);
	}
}
