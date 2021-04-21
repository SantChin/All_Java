package com.san.java.level1;

public class FindTwoMaximumNumbersInArray {

	
	public static void main(String[] args) {
		
		int ar[] = { 66, 7, 9, 70, 89, 11, 2, 93 };
		int m1 =0;
		int m2=0;
		
		for(int i=0;i<ar.length;i++) {
			
			if(ar[i] > m1) {
				m2=m1;
				m1=ar[i];
				
			}
		}
		
		System.out.println("Max1 : " +m1 + "  Max2 : "+m2);
	}
}
