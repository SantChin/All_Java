package com.san.datastructure.array;

public class FindSecondMaxInArray {

	public static void main(String[] args) {
		
		
		int[] arr = {13,2,34,12,1,34,34,6};
		
		findSecondMaxInArray(arr);
	}

	private static void findSecondMaxInArray(int[] arr) {
		if(arr == null || arr.length == 0)
			System.out.println("Invalid Input");
	
	
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length ;i++) {
			if(arr[i]>max) {
				secondMax = max;
				max =arr[i];
			}else if(arr[i]>secondMax && arr[i] !=max) {
				secondMax = arr[i];
			}
		}
		System.out.println(secondMax);
	
	
	}
	
}
