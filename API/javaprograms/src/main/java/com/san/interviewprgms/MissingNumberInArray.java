package com.san.interviewprgms;

public class MissingNumberInArray {

	
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,5};
		int missingNumberInArr = missingNumberInArr(arr, 5);
		System.out.println(missingNumberInArr);
	}
	
	static int missingNumberInArr(int[] arr,int n) {
		int sum = n * (n+1) / 2;
		int i=0;
		while(i<n-1) {
			sum-=arr[i];
			i++;
		}
		return sum;
	}
}
