package com.san.datastructure;

public class DoublyLinkedList {

	private ListNode head;
	private ListNode tail;
	private int length;
	
	
	private class ListNode{
		private int data;
		private ListNode next;
		private ListNode prev;
		
		public ListNode(int data) {
			this.data = data;
		}
	}
	
	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}
	
	public boolean isEmpty() {
		return length == 0; //head ==null
	}
	
	public int length() {
		return length;
	}
	
	
	
	public void displayForward() {
		if(head ==null)
			return;
		ListNode temp = head;
		while(temp!=null) {
			System.out.print(temp.data + "-->");
			temp=temp.next;
		}
		System.out.print(temp);
		System.out.println();
	}
	
	
	public void displayBackward() {
		if(tail == null)
			return;
		ListNode temp =tail;
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			temp = temp.prev;
		}
		System.out.print(temp);
	}
	
	public void insertAtFirst(int data) {
		ListNode newNode = new ListNode(data);
		if(isEmpty()) {
			tail = newNode;
		}else {
			head.prev = newNode;
		}
		newNode.next = head;
		head = newNode;
		length++;
		
	}
	
	public void inserAtLast(int data) {
		ListNode newNode = new ListNode(data);
		if(isEmpty()) {
			head = newNode;
		}else {
			tail.next = newNode;
			newNode.prev = tail;
		}
		tail = newNode;
		length++;
	}
	
	
	public void deleteFirst() {
		if(isEmpty())
			return;
		
		ListNode temp = head;
		if(head == tail) {
			tail = null;
		}else {
			head.next.prev = null;
		}
		head = head.next;
		temp.next = null;
	}
	
	public void deleteLast() {
		if(isEmpty()) {
			System.out.println("List is empty");
			return;
		}
		
		ListNode temp = tail;
		if(head == tail) {
			head = null;
		}else {
			tail.prev.next = null;
		}
		tail = tail.prev;
		temp.prev = null;
	}
	
	public static void main(String[] args) {
		DoublyLinkedList dll =  new DoublyLinkedList();
		dll.insertAtFirst(1);
		//dll.insertAtFirst(2);
		//dll.insertAtFirst(3);
		
		//dll.inserAtLast(4);
		
		
		//dll.displayForward();
		//dll.displayBackward();
		
		//dll.deleteFirst();
		//System.out.println();
		
		//dll.displayForward();
		//dll.displayBackward();
		
		dll.deleteLast();
		System.out.println();
		
		dll.displayForward();
		dll.displayBackward();
		
		dll.deleteLast();
		System.out.println();
		
		dll.displayForward();
		dll.displayBackward();
		
		
	}
}
