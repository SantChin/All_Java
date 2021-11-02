package com.san.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.san.streams.Employee;

public class ComparaotrCustomSorting {

	public static void main(String[] args) {
		
		List<Employee> employeeList = Arrays.asList(
				new Employee("1", "Ajay", 45, 35000,"HR", true),
				new Employee("2", "Vijay", 25, 36000,"HR", false), 
				new Employee("3", "Ajay", 50, 50000,"IT", false),
				new Employee("4", "Vijay", 54, 60000, "IT",true), 
				new Employee("5", "Ajay", 85, 70000,"ADMIN", true),
				new Employee("6", "Vijay", 70,80000,"ADMIN", true));
		
		System.out.println("Emp List before sorting");
		employeeList.forEach(emp -> System.out.println(emp.getAge()));
		employeeList.sort(Comparator.comparing(Employee::getAge));
		System.out.println("Emp List after sorting");
		employeeList.forEach(emp -> System.out.println(emp.getAge()));
		
		System.out.println("Emp List after sorting reversed");
		employeeList.sort(Comparator.comparing(Employee::getAge).reversed());
		employeeList.forEach(emp -> System.out.println(emp.getAge()));
		
		//grouping by comparator Name and Age
		Comparator<Employee> groupByComparator = Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getAge);
		employeeList.sort(groupByComparator);
		employeeList.forEach(emp -> System.out.println(emp.getFirstName() +"--"+emp.getAge()));
		
	}
	
	
	
}
