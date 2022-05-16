package com.san.datastructure;

import java.awt.DisplayMode;
import java.util.ArrayList;
import java.util.List;

import org.omg.PortableInterceptor.DISCARDING;

public class SingleLinkedList {

	private ListNode head;

	private static class ListNode {
		private int data; //Generric Type
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void insertFirst(int value) {
		ListNode newNode  = new ListNode(value);
		newNode.next = head;
		head = newNode;
		
	}
	
	public void insertLast(int value) {
		ListNode lastNode = new ListNode(value);
		
		if(head == null) {
			head = lastNode;
		}else {
			ListNode current = head;
			while(current.next!=null) {
				current = current.next;
			}
			current.next = lastNode;
		}
	}
	
	
	public void insertAtPosition(int data,int pos) {
		ListNode newNode = new ListNode(data);
		if(pos == 1) {
			newNode.next = head;
			head = newNode;
		}else {
			ListNode prev = head;
			int count = 1;
			while(count<pos-1) {
				prev= prev.next;
				count++;
			}
			ListNode current = prev.next;
			newNode.next = current;
			prev.next = newNode;
		}
	}
	
	public int getCountOfNodes() {
		if(head == null) {
			return 0;
		}
		
		int count = 0;
		ListNode current = head;
		while(current!=null) {
			count++;
			current = current.next;
		}
		return count;
	}
	
	public void display() {
		
		ListNode current = head;
		while(current!=null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}
		System.out.println(current);
	}
	
	public void displayListNode(ListNode t) {
		while(t!=null) {
			System.out.print(t.data + "--->");
			t= t.next;
		}
		System.out.println(t);
	}
	
	public void deleteFirst() {
		if(head == null)
			return;
		
		ListNode current = head.next;
		head = current;
	}
	
	public void deleteLast() {
		if(head == null)
			return;
		
		ListNode current = head;
		ListNode prev = null;
		while(null!=current.next) {
			prev = current;
			current = current.next;
		}
		prev.next = null;
	}
	
	public void deleteAtPosition(int pos) {
		/*ListNode current = head;
		ListNode prev = null;
		int count = 1;
		while(count<pos) {
			prev = current;
			current = current.next;
			count++;
		}
		ListNode ahead = current.next;
		prev.next = ahead;*/
		
		
		if(pos == 1) {
			head = head.next;
		}
		else {
			ListNode prev = head;
			int count = 1;
			while(count<pos-1) {
				prev = prev.next;
				count++;
			}
			ListNode current = prev.next;
			prev.next = current.next;
		}
		
	}
	
	public boolean searchKey(int key) {
		if(head == null)
			return false;
		
		ListNode current = head;
		while(current!=null) {
			if(current.data == key) {
				return true;
				}
			current = current.next;
		}
		return false;
	}
	
	public void reverseALinkedList() {
		if(head == null)
			return;
		
		ListNode current = head;
		ListNode prev = null;
		ListNode next = null;
		
		while(current!=null) {
			next = current.next;
			current.next = prev;
			prev= current;
			current =next;
		}
		head = prev;
		
	}
	
	
	public ListNode middleNode() {
		ListNode slowPtr = head;
		ListNode fastPtr = head;
		while(fastPtr!=null && fastPtr.next!=null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		return slowPtr;
	}
	
	public ListNode getNthNodeFromLastInSll(int n) {
		
		if(head == null)
			return null;
		
		if(n<=0)
			throw new IllegalArgumentException("Invalid Value for n : "+n);
		
		ListNode mainPtr = head;
		ListNode refPtr = head;
		int count = 0;
		while(count<n) {
			
			if(refPtr == null) {
				throw new IllegalArgumentException(n + " Is greather than the number of nodes in the list");
			}
			
			refPtr = refPtr.next;
			count++;
		}
		
		while(refPtr!=null) {
			refPtr = refPtr.next;
			mainPtr = mainPtr.next;
		}
		return mainPtr;
	}
	
	
	public void removeDuplicateNodesFromSortedSll() {
		if(head == null)
			return;
		
		ListNode current = head;
		while(current!=null && current.next!=null) {
			if(current.data == current.next.data) {
				current.next = current.next.next;
			}else {
				current =current.next;
			}
		}
	}
	
	public void insertNodeInSortedSllList(int value) {
		if(head == null)
			return ;
		
		ListNode newNode = new ListNode(value);
		ListNode current = head;
		while(current!=null && current.next!=null) {
			if(value>=current.data && value<=current.next.data) {
				ListNode next = current.next;
				current.next = newNode;
				newNode.next = next;
			}
		}
	}
	
	public void removeNthNodeFormSllList(int key) {
		if(head == null)
			return ;
		
		
		ListNode current = head;
		ListNode temp = null;
		while(current!=null && current.data!=key) {
			temp = current;
			current = current.next;
		}
		if(current==null) return;
		temp.next = current.next;
	}
	
	
	public boolean detectLoopInSLL() {
		if(head == null)
			return false;
		
		ListNode fastPtr = head;
		ListNode slowPtr = head;
		
		while(fastPtr!=null && fastPtr.next!=null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			if(fastPtr == slowPtr)
				return true;
		}
		return false;
	}
	
	public ListNode detectLoopAndReturnStartNodeInSLL() {
		if(head == null)
			return null;
		
		ListNode fastPtr = head;
		ListNode slowPtr = head;
		
		while(fastPtr!=null && fastPtr.next!=null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			if(fastPtr == slowPtr)
				return getStartNode(slowPtr);
		}
		return null;
	}
	
	public ListNode getStartNode(ListNode slowPtr) {
		//Floyd's Cycle Detection Algo
		ListNode temp = head;
		while(temp!=slowPtr) {
			temp = temp.next;
			slowPtr = slowPtr.next;
		}
		return temp; //Starting Node of the Loop
	}
	
	public void detectLoopAndRemoveLoopInSLL() {
		if(head == null)
			return ;
		
		ListNode fastPtr = head;
		ListNode slowPtr = head;
		
		while(fastPtr!=null && fastPtr.next!=null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			if(fastPtr == slowPtr)
				removeLoop(slowPtr);
		}
	}
	
	public void removeLoop(ListNode slowPtr) {
		//Floyd's Cycle Detection Algo
		ListNode temp = head;
		while(temp.next!=slowPtr.next) {
			temp = temp.next;
			slowPtr = slowPtr.next;
		}
		slowPtr.next = null;
		 //Starting Node of the Loop
	}
	
	public ListNode mergeTwoSortedLL(ListNode a,ListNode b) {
		//a-->1-->3-->5-->null
		//b-->2-->4-->6-->null
		//R-->1-->2-->3-->4-->5-->6-->null
		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;
		while(a!=null && b!=null) {
			if(a.data<=b.data) {
				tail.next = a;
				a = a.next;
			}else {
				tail.next = b;
				b = b.next;
			}
			tail = tail.next;
		}
		
		if(a==null) {
			tail.next = b;
		}else {
			tail.next = a;
		}
		return dummy.next;
	}
	
	
	public void createALoopInLinkedList() {
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(4);
		ListNode fifth = new ListNode(5);
		ListNode sixth = new ListNode(6);
		ListNode seven = new ListNode(7);
		ListNode eight = new ListNode(8);
		ListNode nine = new ListNode(9);
		ListNode ten = new ListNode(10);
		
		
		head = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = seven;
		seven.next = eight;
		eight.next = nine;
		nine.next =ten;
		ten.next =fourth;
		
	}
	
	public ListNode addtwoSll(ListNode a,ListNode b) {
		ListNode tail = new ListNode(0);
		ListNode dummy = tail;
		int carry = 0;
		while(a!=null || b!=null) {
			int x = a!=null?a.data : 0;
			int y = b!=null?b.data : 0;
			int sum = carry+x+y;
			carry = sum/10;
			tail.next = new ListNode(sum%10);
			tail = tail.next;
			if(a!=null) a= a.next;
			if(b!=null) b = b.next;
		}
		if(carry > 0) {
			tail.next = new ListNode(carry);
		}
		return dummy.next;
	}
	
	public <T> ListNode reverseSll(ListNode a) {
		ListNode reversedSll = new ListNode(0);
		List<T> tempList = new ArrayList<T>();
		while(a!=null) {
			tempList.add(a.data, null);
			a=a.next;
		}System.out.println(tempList);
		return reversedSll;
	}
	
	public static void main(String[] args) {
//		SingleLinkedList sll = new SingleLinkedList();
//		sll.head = new ListNode(0);
//		ListNode second  = new ListNode(3);
//		ListNode third  = new ListNode(3);
//		ListNode fourth  = new ListNode(4);
//		ListNode fifth = new ListNode(11);
//		
//		sll.head.next = second;
//		second.next = third;
//		third.next = fourth; //10-->8-->1-->11-->null
//		 
//		sll.insertFirst(0);
//		
//		sll.insertLast(5);
//		
//		
//		sll.display();
		
//		sll.insertAtPosition(55,4);
//		
//		sll.display();
//		
//		sll.deleteFirst();
//		
//		sll.display();
//		//sll.deleteLast();
//		sll.display();
//		
//		sll.deleteAtPosition(3);
//		sll.display();
//		sll.reverseALinkedList();
//		sll.display();
//		
//		System.out.println(sll.middleNode().data);
//		
//		System.out.println(sll.getNthNodeFromLastInSll(4).data);
//		
//		System.out.println(sll.searchKey(55));
//		
//		System.out.println("Total Count Of Nodes : "+sll.getCountOfNodes());
		
	//	sll.removeDuplicateNodesFromSortedSll();
		
	//	sll.display();
		
	//	sll.removeNthNodeFormSllList(4);
	//	sll.display();
		
//		sll.createALoopInLinkedList();
//		System.out.println(sll.detectLoopInSLL());
//		System.out.println(sll.detectLoopAndReturnStartNodeInSLL().data);
//		sll.detectLoopAndRemoveLoopInSLL();
//		sll.display();
		//sll.display();
		
		
		SingleLinkedList sll1 = new SingleLinkedList();
		sll1.insertLast(1);
		sll1.insertLast(4);
		sll1.insertLast(8);
		
		SingleLinkedList sll2 = new SingleLinkedList();
		sll2.insertLast(2);
		sll2.insertLast(3);
		sll2.insertLast(9);
		
		ListNode a = new ListNode(1);
		a.next = new ListNode(4);
		a.next.next = new ListNode(8);
		
		ListNode b = new ListNode(2);
		b.next = new ListNode(3);
		b.next.next = new ListNode(9);
		
		
		//sll2.insertLast(9);
	//	sll2.insertLast(14);
		
		
		
		SingleLinkedList result = new SingleLinkedList();
		//result.head = result.mergeTwoSortedLL(sll1.head,sll2.head);
		//result.display();
		
		result.displayListNode(a);
		result.displayListNode(b);
		ListNode addtwoSll = result.addtwoSll(a, b);
		result.displayListNode(addtwoSll);

		
		result.reverseSll(addtwoSll);
		
	}
}
