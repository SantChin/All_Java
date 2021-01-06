package com.san.datastructure.linkedlist;

public class EmployeeLinkedList {

	private EmployeeNode head;
	int size;

	public void addToFront(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		node.setNext(head);
		head = node;
		size++;
	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public EmployeeNode removeFrontNode() {

		if (head == null) {
			return null;
		}

		EmployeeNode removerNode = head;
		head = head.getNext();
		removerNode.setNext(null);
		size--;
		return removerNode;
	}

	public void printList() {
		EmployeeNode current = head;
		System.out.print("HEAD -->");
		while (current != null) {
			System.out.print(current);
			System.out.print("-->");
			current = current.getNext();
		}
		System.out.println("null");

	}

}
