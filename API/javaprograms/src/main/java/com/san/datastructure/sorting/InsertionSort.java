package com.san.datastructure.sorting;

public class InsertionSort {

	public static void main(String args[]) {

		int intArray[] = { 20, 35, -15, 7, 55, 1, -22 };

		for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {

			int newElement = intArray[firstUnsortedIndex];

			int i;

			/*
			 * Move elements of arr[0..i-1], that are greater than key, to one position
			 * ahead of their current position
			 */

			for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
				intArray[i] = intArray[i - 1];
			}
			intArray[i] = newElement;
		}

		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

	}

	// Another Approch

	void sort(int arr[]) {
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;

			/*
			 * Move elements of arr[0..i-1], that are greater than key, to one position
			 * ahead of their current position
			 */
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}
}
