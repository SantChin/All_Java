package com.san.java.level1;

public class SetOfTwoConsecutiveNumbersWithHighestSum {

	public static void main(String[] args) {
		
		int arr[] = { 1, 9, 8, 3, 6, 9, 9, 5, 4, 9 };
		int highestSum = 0;
		
		int index1 = 0,index2 = 0;
		
		
		for(int i =0;i<arr.length-1;i++) {
			if(arr[i] + arr[i+1] > highestSum) {
				highestSum = arr[i] + arr[i+1];
				index1 = i ;
				index2 = i+1 ;
			}
			
		}
		
		System.out.println("Numbers : "+ arr[index1] + ","+arr[index2] + " ...indexes"+ index1 +","+index2);
	}
}

	 

