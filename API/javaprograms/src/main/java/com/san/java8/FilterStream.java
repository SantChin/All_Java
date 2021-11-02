package com.san.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.san.streams.Employee;

public class FilterStream {

	public static void main(String[] args) {
		
		
		List<Employee> employeeList = Arrays.asList(
				new Employee("1", "Ajay", 45, 35000,"HR", true),
				new Employee("2", "Vijay", 25, 36000,"HR", false), 
				new Employee("3", "Ajay", 50, 50000,"IT", false),
				new Employee("4", "Vijay", 54, 60000, "IT",true), 
				new Employee("5", "Ajay", 85, 70000,"ADMIN", true),
				new Employee("6", "Vijay", 70,80000,"ADMIN", true));
		
		
		List<Employee> collectList = employeeList.stream().filter(emp->emp.getAge()>50).collect(Collectors.toList());
		collectList.forEach(emp->System.out.println(emp));
		collectList.forEach(emp->System.out.println(emp));
		
	
		//Using the Map
		
		List<String> listNames = employeeList.stream().filter(emp->emp.getAge()>50)
						.map(Employee::getFirstName).collect(Collectors.toList());
		listNames.forEach(e->System.out.println(e));
		
		
	}
}
