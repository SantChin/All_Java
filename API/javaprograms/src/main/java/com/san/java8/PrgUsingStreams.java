package com.san.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.san.streams.Employee;

public class PrgUsingStreams {

	public static void main(String[] args) {
		List<Employee> employeeList = Arrays.asList(
				new Employee("1", "Ajay", 35, 35000,"HR", true),
				new Employee("2", "Ajay", 45, 36000,"HR", false), 
				new Employee("3", "Ajay", 50, 50000,"IT", false),
				new Employee("4", "Vijay", 54, 60000, "IT",true), 
				new Employee("5", "Vijay", 60, 70000,"ADMIN", true),
				new Employee("6", "Vijay", 70,80000,"ADMIN", true));
		
		Map<String, List<Employee>> mapList = employeeList.stream().collect(Collectors.groupingBy(Employee::getDept));
		mapList.forEach((key,value)->System.out.println("Key " + key +" -> Value "+value));
		
		
	}
}
