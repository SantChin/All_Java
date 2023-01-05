package com.san.datastructure.array;

public class MoveZerosToEndInArray {

	
	public static void main(String[] args) {
		
		int arr[] = {3,0,5,0,1,2};
		
		moveZerosToEnd(arr);
	}

	private static void moveZerosToEnd(int[] arr) {
		
		if(arr.length == 0)
			System.out.println("Array is empty");
		else {
			System.out.println("Before Moving Zeros");
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]);
			}
		int j =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0 && arr[j] == 0) {
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
			if(arr[j]!=0) {
				j++;
			}
		}
		
		System.out.println("After Moving Zeros");
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]);
			}
		}
	}
}
