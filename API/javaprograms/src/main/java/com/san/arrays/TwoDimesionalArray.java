package com.san.arrays;

public class TwoDimesionalArray {

	
	public static void main(String[] args) {
		
		
		int [][] arr = {{2,7,9},{4,3,9},{5,6,9}};// new int [3][3];
		
		for(int i = 0;i<arr.length;i++) {
			
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
