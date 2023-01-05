package com.san.datastructure.stack;

import java.util.Stack;

public class StackNextGreaterElement {

	
	public static int[] findNextGreaterElement(int[] arr) {
		int[] res = new int[arr.length];
		Stack<Integer> stack = new Stack<Integer>();
		for(int i=arr.length-1;i>=0;i--) {
			while(!stack.isEmpty() && stack.peek()<=arr[i]) {
				stack.pop();
			}
			if(stack.isEmpty()) {
				res[i] = -1;
			}else {
				res[i]=stack.peek();
			}
			stack.push(arr[i]);
		}
		
		return res;
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = {4,7,3,8,4,8,1};
		
	int[] findNextGreaterElement = findNextGreaterElement(arr);
	System.out.println("After");
	for(int i=0;i<findNextGreaterElement.length;i++) {
		System.out.print(findNextGreaterElement[i]);
	}
	}
}
