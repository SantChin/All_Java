package com.san.datastructure.array;

public class FindMissingNumberInNaturalNumberSeries {

	
	
	
	
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,5,6,7,8};
		
		String java = "/GREEN/Documents/";
		
		//findTheMissingNumber(arr);
		
		replaceLastOccrenceString(java);
		
	}

	private static void replaceLastOccrenceString(String s) {
		s = s.replaceAll("[/]$", "");
		System.out.println(s);
		
	}

	public static void findTheMissingNumber(int[] arr) {
		int n = arr.length+1;
		int sum = (n*(n+1)) / 2;
		int val = 0;
		for(int i=0;i<arr.length;i++) {
			val =val+arr[i];
		}
		System.out.println("Missing Number" + (sum -val));
		
		
	}
}
