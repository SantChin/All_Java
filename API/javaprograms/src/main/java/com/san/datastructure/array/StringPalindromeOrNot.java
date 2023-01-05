package com.san.datastructure.array;

public class StringPalindromeOrNot {

	public static void main(String[] args) {
		
		System.out.println("MadaM is Palindrome : " + isPalindrome("MadaM"));
		System.out.println("Core is Palindrome : " + isPalindrome("Core"));
		
	}
	
	public static boolean isPalindrome(String value) {
		char[] charArr = value.toCharArray();
		int start =0;
		int end = value.length() - 1;
		while(start < end) {
			if(charArr[start]!=charArr[end]) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}
