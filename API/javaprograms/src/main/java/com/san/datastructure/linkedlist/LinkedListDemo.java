package com.san.datastructure.linkedlist;

public class LinkedListDemo {

	public static void main(String[] args) {

		Employee ajay = new Employee(1, "Ajay", "Reddy");
		Employee ragahv = new Employee(2, "Ragahv", "Verma");
		Employee santosh = new Employee(3, "Santosh", "Reddy");
		Employee akhil = new Employee(4, "Akhil", "Yadhav");
		Employee ashwin = new Employee(5, "Ashwin", "Rao");

		EmployeeLinkedList employeeList = new EmployeeLinkedList();

		System.out.println(employeeList.isEmpty());

		//employeeList.addToFront(ashwin);
		//employeeList.addToFront(ragahv);
		employeeList.addToFront(ajay);
		employeeList.addToFront(santosh);

		System.out.println(employeeList.isEmpty());
		System.out.println(employeeList.getSize());

		employeeList.addToFront(akhil);

		// Print the List
		employeeList.printList();

		employeeList.removeFrontNode();
		
		employeeList.printList();
	}
}
