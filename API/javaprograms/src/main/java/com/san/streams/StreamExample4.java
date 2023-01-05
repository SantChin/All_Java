package com.san.streams;

import java.io.ObjectInputStream.GetField;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class StreamExample4 {

	public static void main(String[] args) {
		
		List<Employee> employeeList = Arrays.asList(
				new Employee("1", "Ajay", 35, 35000,"HR", true),
				new Employee("2", "Vamshi", 45, 36000,"HR", false), 
				new Employee("3", "Rajesh", 50, 50000,"IT", false),
				new Employee("4", "Akash", 54, 60000, "IT",true), 
				new Employee("5", "Sanjay", 60, 70000,"ADMIN", true),
				new Employee("6", "Raju", 70,80000,"ADMIN", true));
		
		
		System.out.println();
		System.out.println("Grouping By dept and print");
		//Grouping By dept and print
		Map<String, List<Employee>> groupByDept = employeeList.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.toList()));
		groupByDept.entrySet().forEach(e->{
			System.out.println(e.getKey() + "--------->" + e.getValue());
		});
		
		System.out.println();
		System.out.println("Print employees count working in each dept");
		//Print employees count working in each dept
		Map<String, Long> countOfEmployeesByDept = employeeList.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));
		countOfEmployeesByDept.entrySet().forEach(e->{
			System.out.println(e.getKey() + "--------->" + e.getValue());
		});
		
		
		System.out.println();
		System.out.println("Print active and inactive employeess");
		//Print active and inactive employeess 
		Map<Boolean, List<Employee>> activeInactiveEmployees = employeeList.stream().collect(Collectors.groupingBy(Employee::isActive,Collectors.toList()));
		activeInactiveEmployees.entrySet().forEach(e->{
			System.out.println(e.getKey() + "--------->" + e.getValue());
		});
		
		System.out.println();
		System.out.println("Print active and inactive employeess count");
		//Print active and inactive employeess count
		long activeCount = employeeList.stream().filter(e->e.isActive()).count();
		long NotActiveCount = employeeList.stream().filter(e->!e.isActive()).count();
		
		System.out.println("Active Employee Count " + activeCount);
		System.out.println("Not Active Employee Count " + NotActiveCount);
		
		System.out.println();
		System.out.println("Print max/min employess salary from given collection");
		//Print max/min employess salary from given collection
		Optional<Employee> max = employeeList.stream().max(Comparator.comparing(Employee::getSalary));
		if(max.isPresent()) {
			System.out.println("Max Salary in Given List " + max.get().getSalary());
		}
		
		Optional<Employee> min = employeeList.stream().min(Comparator.comparing(Employee::getSalary));
		if(max.isPresent()) {
			System.out.println("Min Salary in Given List " + min.get().getSalary());
		}
		
		System.out.println();
		System.out.println("Print max salary from each Dept.");
		//Print max salary from each Dept.
		employeeList.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.toList())).entrySet().forEach(e->{
			Optional<Employee> max2 = e.getValue().stream().max(Comparator.comparing(Employee::getSalary));
			if(max2.isPresent()) {
				System.out.println("Dept : " +max2.get().getDept() +" Max Salary : " +max2.get().getSalary());
			}
		});
		
		System.out.println();
		System.out.println("Print max salary from each Dept. Apprch 2");
		//Print max salary from each Dept.Approch 2
		Map<String, Optional<Employee>> topSalDeptWise = employeeList.stream().collect(Collectors.groupingBy(Employee::getDept,
				Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))
				));
		
		topSalDeptWise.entrySet().stream().forEach(e->{
			System.out.println("Dept : " +e.getKey() +" Max Salary : " +e.getValue().get().getSalary());
		});
		
		
		
	}
}
