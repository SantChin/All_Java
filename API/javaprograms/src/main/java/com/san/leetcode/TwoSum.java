package com.san.leetcode;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		int[] a1 = { 2,  11, 15 ,7}; // [2,7,11,15], target = 9
		int[] a2 = { 3, 2, 4 }; // [3,2,4], target = 6
		int[] a3 = { 3, 3 }; // [3,3], target = 6

		System.out.println(Arrays.toString(twoSum(a1, 9)));
		//System.out.println(Arrays.toString(twoSum(a2, 6)));
		//System.out.println(Arrays.toString(twoSum(a3, 6)));
	}

	public static int[] twoSum(int[] arr, int target) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					return new int[] { i, j };
				}
			}
		}

		return null;
	}
}
