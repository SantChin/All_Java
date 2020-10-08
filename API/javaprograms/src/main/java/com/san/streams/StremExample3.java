package com.san.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Now we Streams on List of Objects
//sorting
//map
//filter
//collector

//case 1: from list of employees sort decending based on age and fetch first 3
//case 2: fetch only names
//case 3: only active employess
//case 4:we want names in ,seperated string
//case 5: Storing active emploees with id as key and empolyee Object as value
//case 6: Storing active emploees group by department

public class StremExample3 {

	public static void main(String[] args) {

		// Fetch List of Employee Objects from DataBase.
		List<Employee> employeeList = Arrays.asList(
				new Employee("1", "Ajay", 35, 35000,"HR", true),
				new Employee("2", "Vamshi", 45, 36000,"HR", false), 
				new Employee("3", "Rajesh", 50, 50000,"IT", false),
				new Employee("4", "Akash", 54, 60000, "IT",true), 
				new Employee("5", "Sanjay", 60, 70000,"ADMIN", true),
				new Employee("6", "Raju", 70,80000,"ADMIN", true));

		// case1: from list of employees sort decending based on age and fetch first 3
		System.out.println("---With Out Using Streams Fetching First 3 employees in desc--- ");

		List<Employee> copy = new ArrayList<>(employeeList); // Copying the original collection

		copy.sort((e1, e2) -> e2.getAge() - e1.getAge()); // Sorting in descending
		// order
		// copy.sort((e1, e2) -> e1.getAge() - e2.getAge()); // Sorting in asc

		for (int i = 0; i < 3; i++) {
			Employee emp = copy.get(i);
			System.out.println(emp.toString());
		}

		System.out.println("\n---With Streams Fetching First 3 employees in desc --- ");

		employeeList.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).limit(3)
				.forEach(System.out::println);

		// case2: fetch only names
		System.out.println("\n\n");

		System.out.println("---With Out Using Streams fetching only names--- ");
		for (int i = 0; i < 3; i++) {
			Employee emp = copy.get(i);
			System.out.println(emp.getFirstName());
		}

		System.out.println("\n---With Streams fetching names--- ");
		employeeList.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).limit(3)
				.map(Employee::getFirstName).forEach(System.out::println);

		// case3: only active employess
		System.out.println("\n\n");

		System.out.println("---With Out Using Streams fetching only active employess--- ");
		for (int i = 0; i < copy.size(); i++) {
			Employee emp = copy.get(i);
			if (emp.isActive())
				System.out.println(emp.toString());
		}

		System.out.println("\n---With Streams fetching active employess--- ");
		employeeList.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).filter(e -> e.isActive())
				.limit(3).forEach(System.out::println);

		// case4:we want names in ,seperated string
		System.out.println("\n\n");
		System.out.println("---With Out Using Streams names , seperated--- ");
		List<String> tempList = new ArrayList<>();
		for (int i = 0; i < copy.size(); i++) {
			Employee emp = copy.get(i);
			if (emp.isActive()) {
				tempList.add(emp.getFirstName());
			}
		}
		System.out.println(String.join(",", tempList));
		
		System.out.println("\n---With Streams names , seperated--- ");
		String names = employeeList.stream()
					.sorted(Comparator.comparingInt(Employee::getAge).reversed())
					.filter(e -> e.isActive())
					.limit(3)
					.map(Employee::getFirstName)
					.collect(Collectors.joining(","));
		System.out.println(names);
		
		//case 5: Storing active emploees with id as key and empolyee Object as value
		System.out.println("\n\n");
		System.out.println("---With Out Using Streams Storing emploees with id as key and empolyee Object as value--- ");
		Map<String,Employee> empMap = new HashMap<>();
		for (int i = 0; i < copy.size(); i++) {
			Employee emp = copy.get(i);
			if (emp.isActive()) {
				empMap.put(emp.getId(), emp);
			}
		}
		System.out.println(empMap.toString());
		
		
		System.out.println("\n---With Streams Storing emploees with id as key and empolyee Object as value--- ");
		Map<String,Employee> empMap1 =  employeeList.stream()
					.sorted(Comparator.comparingInt(Employee::getAge).reversed())
					.filter(e1 -> e1.isActive())
					.limit(3)
					.collect(Collectors.toMap(e1 ->e1.id,e1->e1));
		System.out.println(empMap1.toString());


		//case 6: Storing active emploees group by department
				System.out.println("\n\n");
				System.out.println("---With Out Using Streams Storing active emploees group by department--- ");
				Map<String,List<Employee>> dataMap1 = new HashMap<>();
				
				for (int i = 0; i < copy.size(); i++) {
					Employee emp = copy.get(i);
					if (emp.isActive()) {
						if(dataMap1.containsKey(emp.getDept()))
							dataMap1.get(emp.getDept()).add(emp);
						else {
							List<Employee> tempList1 = new ArrayList<>();
							tempList1.add(emp);
							dataMap1.put(emp.getDept(),tempList1);
						}
					}
				}
				
				
				System.out.println(dataMap1.toString());
				
				System.out.println("\n---With Using Streams Storing active emploees group by department--- ");
				
				Map<String,List<Employee>> dataMap2 = employeeList.stream()
				.sorted(Comparator.comparingInt(Employee::getAge).reversed())
				.filter(e1 -> e1.isActive())
				.collect(Collectors.groupingBy(Employee::getDept));
				
				System.out.println(dataMap2.toString());
				
	}
}
