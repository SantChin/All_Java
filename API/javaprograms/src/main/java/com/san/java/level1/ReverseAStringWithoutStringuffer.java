package com.san.java.level1;


/*
 * 
 * Complexity to reverse String in java without using StringBuffer in java >
Now, lets see how complexity is O(n/2).
We are executing only half the number of characters we have in our string.


Best case: O(n/2)- (1/2), when we have odd number of characters in string.
Average case: O(n/2) , generally when we have even number of characters in string.
Worst case: O(n/2).
 * */

public class ReverseAStringWithoutStringuffer {

	public static void main(String[] args) {
		String s = "abcdef";
		char[] arr = s.toCharArray();
		char temp;
		for (int i = 0, j = arr.length - 1; i < (arr.length / 2); i++, j--) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}

		System.out.println(new String(arr));
	}
}
