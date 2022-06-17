package com.san.datastructure;

import java.util.NoSuchElementException;

public class CircularSinglyLinkedList {

	private ListNode tail;
	private int length;

	private class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
		}
	}
	
	public CircularSinglyLinkedList() {
		tail=null;
		length = 0;
	}
	
	public int lenght() {
		return length;
	}
	
	public boolean isEmpty() {
		return length == 0;
	}
	
	
	public void createCircularLinkedList() {
		ListNode first = new ListNode(1);
		ListNode two = new ListNode(5);
		ListNode three = new ListNode(10);
		ListNode four = new ListNode(15);
		
		first.next = two;
		two.next = three;
		three.next = four;
		four.next = first;
		tail = four;
	}
	
	
	
	
	public void insertAtFirstNode(int data) {
		ListNode newNode = new ListNode(data);
		if(tail == null) {
			tail=newNode;
		}else {
			newNode.next = tail.next;
		}
		tail.next = newNode;;
		length++;
	}
	
	//public void deleteLastNode() {
	//	if(tail == null) {
	//		System.out.println("List is empty");
	//	}
	//}
	
	public void insertAtTheEnd(int data) {
		ListNode newNode = new ListNode(data);
		if(tail == null) {
			tail = newNode;
		}else {
			newNode.next = tail.next;
			tail.next = newNode;
		}
		tail = tail.next;
		length++;
	}
	
	public void removeFirstNode() {
		if(tail == null) {
			System.out.println("List is empty");
		}else {
			tail.next = tail.next.next;
		}
	}
	
	public void removeFirstNodeV2() {
		if(isEmpty()) {
			System.out.println("No Elements");
			throw new NoSuchElementException("Is is Empty");
		}
		
		ListNode temp = tail.next;
		if(tail.next == tail) {
			tail = null;
		}else {
			tail.next = temp.next;
		}
		temp.next = null;
		length--;
		//return temp;
	}
	
	
	public void printCll() {
		
	
		if(tail == null) {
			System.out.println("List is empty");
		}
		
		ListNode first =tail.next;
		while(first!=tail) {
			System.out.print(first.data + "-->");
			first = first.next;
		}
		System.out.print(first.data);
	}
	
	public static void main(String[] args) {
		CircularSinglyLinkedList cll = new CircularSinglyLinkedList();
		cll.createCircularLinkedList();
		
		cll.printCll();
		
		
		System.out.println();
		
		cll.insertAtFirstNode(20);
		cll.printCll();
		
		System.out.println();
		cll.insertAtTheEnd(30);
		cll.printCll();
		
		System.out.println();
		cll.removeFirstNode();
		cll.printCll();
		
		System.out.println();
		cll.removeFirstNode();
		cll.printCll();
	}
}
