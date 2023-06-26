package com.san.drunk;

public class PrintTriangle {

	public static void main(String[] args) {
		
		int value = 5;
		printTriangle(value);
		
	}

	private static void printTriangle(int n) {
		
		//To Handle Rows
		for(int i =0;i<n;i++) {
			
			//To Hadle Spaces
			for(int j=n-i;j>1;j--) {
				System.out.print(" ");
			} 
			
			//To Print "*"s
			for(int j =0;j<=i;j++) {
				System.out.print("* ");
			}
			
			System.out.println();
			
		}
		
	}
}
