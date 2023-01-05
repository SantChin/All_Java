package com.san.datastructure.array;

public class ReSizeArray {

	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		
		System.out.println("Before Resizing");
		printarr(arr);
		
		arr = resizeArray(arr,arr.length *2);
	
	
	}
	
	public static void printarr(int[] arr) {
		for(int i =0 ;i<arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static int[] resizeArray(int[] arr, int capacity) {
		int temp[] = new int[capacity];
		for(int i =0 ;i<arr.length ; i++) {
			temp[i]=arr[i];
		}
		return temp;
	}
	
}
