package com.san.datastructure.queue;

public class Queue {

	
	private ListNode front;
	private ListNode rear;
	private int length = 0;
	
	private class ListNode{
		private int data;
		private ListNode next = null;
		
		ListNode(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	
	public int length() {
		return length;
	}
	
	public boolean isEmpty() {
		return length==0;
	}
	
	
	public void enqueue(int data) {
		ListNode temp = new ListNode(data);
		if(isEmpty()) {
			front = temp;
		}else {
			rear.next = temp;
		}
		rear =temp;
		length++;
	}
	
	public int dequeue() throws Exception {
		if(isEmpty()) {
			throw new Exception("Queue is empty.");
		}
		int data = 0;
		if(front == rear) {
			
		}else {
			data = rear.data;
			
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		
	}
}
