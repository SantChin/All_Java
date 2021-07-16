package com.san.java.level1;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ApproximateTimeCalculation {

	public static void main(String[] args) {
		
		//considering for 100 files time taken is 10 mins
		Date approxTime = getEstimatedTimeofCompletion(75);
		System.out.println(approxTime);
	}

	private static Date getEstimatedTimeofCompletion(int noOfFiles) {
		 Date date = Calendar.getInstance().getTime();
         System.out.println(date);
		if(noOfFiles < 100) {
			 date.setTime(System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(10));
		}else {
			int estimatedMinutes = (noOfFiles * 10)/100;
			date.setTime(System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(estimatedMinutes));
		}
		return date;
	}
}
