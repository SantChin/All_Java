package com.san.java.parallelprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmployeeDatabase {

	
	public static List<Employee> getListOfEmployees(){
		List<Employee> empList = new ArrayList<>();
		
		for(int i=0;i<1000;i++) {
			empList.add(new Employee(i,"Employee"+i,"A", Double.valueOf(new Random().nextInt(1000*100))));
		}
		return empList;
	}
}
