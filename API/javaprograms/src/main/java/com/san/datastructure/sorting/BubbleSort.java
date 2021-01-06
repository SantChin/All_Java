package com.san.datastructure.sorting;

public class BubbleSort {

	public static void main(String[] args) {

		int intArray[] = { 20, 35, -15, 7, 55, 1, -22 };

		for (int j = 0; j < intArray.length - 1; j++) {

			for (int i = 0; i < intArray.length - 1; i++) {
				if (intArray[i] == intArray[i + 1]) {
				} else if (intArray[i + 1] < intArray[i]) {
					int temp = intArray[i];
					intArray[i] = intArray[i + 1];
					intArray[i + 1] = temp;
				}
			}
		}

		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

	}
}
