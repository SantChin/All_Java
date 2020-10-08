package com.san.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Comparator In Streams
//filter
//Mapping
//Collectors
//

public class StreamExample1 {

	public static void main(String[] args) {
		// Fetch List of Employee Objects from DataBase.
				List<Employee> employeeList = Arrays.asList(
						new Employee("1", "Ajay", 35, 35000,"HR", true),
						new Employee("2", "Vamshi", 45, 36000,"HR", false), 
						new Employee("3", "Rajesh", 50, 50000,"IT", false),
						new Employee("4", "Akash", 54, 60000, "IT",true), 
						new Employee("5", "Sanjay", 60, 70000,"ADMIN", true),
						new Employee("6", "Raju", 70,80000,"ADMIN", true));
		
		//fetch emploess basing on age in desceding order and only print first 2 employee Names
		
		//Making a Copy
		List<Employee> employeeListCopy = new ArrayList<>(employeeList);
		
		//Sort Decending
		employeeListCopy.sort((e1,e2) -> e2.getAge() - e1.getAge());
		
		//Sort Asc
		//employeeListCopy.sort((e1,e2) -> e1.getAge() - e2.getAge());
		
		
		//fetching 2
		for(int i=0;i<2;i++) {
			Employee emp = employeeListCopy.get(i);
			System.out.println(emp.toString());
		}
		
		System.out.println("");
		System.out.println("Using Streams  ");
		System.out.println("");
		
		
		employeeList.stream()
					.sorted(Comparator.comparingInt(Employee::getAge).reversed())
					.limit(2)
					//.map(Employee::getFirstName)
					.forEach(System.out::println);
		
		
		
		
		//case 2 : We want list of Names in a String
		List<String> names = employeeList.stream()
										.sorted(Comparator.comparingInt(Employee::getAge).reversed())
										.limit(3)
										.map(Employee::getFirstName)
										.collect(Collectors.toList());
		
		System.out.println(names.toString());
		
		
		System.out.println("Is Active Condition");
		Set<String> names1 = employeeList.stream()
				.sorted(Comparator.comparingInt(Employee::getAge).reversed())
				.filter(e -> e.isActive())
				.limit(3)
				.map(Employee::getFirstName)
				.collect(Collectors.toSet());
										
		 
		System.out.println(names1.toString());
		
		
		
		

	}

}
