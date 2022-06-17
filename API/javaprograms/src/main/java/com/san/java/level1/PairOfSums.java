package com.san.java.level1;

public class PairOfSums {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,3,6};
		pairOfSum(arr);
	}

	private static void pairOfSum(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				
				//System.out.println("Comapres.."+arr[i]+","+arr[j]);
				
				if(arr[i]+arr[j] == 6) {
					System.out.println("Pairs.."+arr[i]+","+arr[j]);
				}
			}
		}
		
	}
}


	