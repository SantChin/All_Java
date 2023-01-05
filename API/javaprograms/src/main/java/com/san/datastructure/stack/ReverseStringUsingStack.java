package com.san.datastructure.stack;

import java.util.Stack;

public class ReverseStringUsingStack {

	
	
	public static String reverseAString(String wrd) {
		char[] charArr = wrd.toCharArray();
		
		Stack<Character> stack = new Stack<>();
		
		for(char c : charArr) {
			stack.push(c);
		}
		
		for(int i=0;i<wrd.length();i++) {
			charArr[i] = stack.pop();
		}
		
		return new String(charArr);
	}
	
	
	public static void main(String[] args) {
	
		
		String wrd = "SANTOSH";
		
		
		System.out.println(reverseAString(wrd));
	}
}
