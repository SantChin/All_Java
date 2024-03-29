package com.san.datastructure.stack;

import java.util.EmptyStackException;

public class StackTest {

	private ListNode top;
	private int length;
	
	private class ListNode {
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data =data;
		}
	}
	
	
	public StackTest() {
		top = null;
		length = 0;
	}
	
	public boolean isEmpty() {
		return length == 0;
	}
	
	public void push(int data) {
		ListNode temp = new ListNode(data);
		temp.next = top;
		top=temp;
		length++;
	}
	
	
	public int pop(){
		
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		int result = top.data;
		top =top.next;
		length--;
		return result;
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		int result = top.data;
		return result;
	}
	
	
	public static void main(String[] args) {
		
	}
}
