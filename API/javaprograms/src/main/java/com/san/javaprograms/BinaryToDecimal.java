package com.san.javaprograms;

public class BinaryToDecimal {

	public int binaryToDecimal(byte[] arr) {

		int number = 0;
		int k = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			number += arr[i] * Math.pow(2, k);

			k++;
		}

		System.out.println(number);

		return 0;

	}

	public static void main(String[] args) {
		byte arr[] = { 1, 1, 0, 0, 1 };
		BinaryToDecimal bd = new BinaryToDecimal();
		bd.binaryToDecimal(arr);
	}

}
