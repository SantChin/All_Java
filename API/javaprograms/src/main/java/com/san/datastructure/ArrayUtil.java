package com.san.datastructure;

public class ArrayUtil {

	public void printArr(int[] arr) {
		int length = arr.length;
		for(int i = 0;i<length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public void arrDemo() {
		int[] arr = new int[5];
		printArr(arr);
	}
	
	
	public static void main(String[] args) {
		ArrayUtil arUtil = new ArrayUtil();
		arUtil.arrDemo();
		
	}
}
