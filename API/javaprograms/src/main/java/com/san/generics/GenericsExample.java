package com.san.generics;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.san.streams.Employee;
import com.san.streams.Student;

//Generics : Introduced from java 1.5
//1.Provides type safety at compile time itself
//2.Code Reusability
//3.Generic Method implemetation
//4.On real time Data/Objects 

class MaximumGeneric {

	public <T extends Comparable<T>> T maximum(T x, T y, T z) {

		T max = x;

		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}

		return max;
	}
}

class Maximum {

	public int maximum(int x, int y, int z) {

		int max = x;

		if (y > max)
			max = y;
		if (z > max)
			max = z;
		return max;
	}

}

class MaximumDouble {

	public double maximum(double x, double y, double z) {

		double max = x;

		if (y > max)
			max = y;
		if (z > max)
			max = z;
		return max;
	}

}

class EmployeeUtility {

	public long getEmployeesCount(List<Employee> list) {
		return list.stream().count();
	}
}

class StudentUtility {

	public long getStudentsCount(List<Student> list) {
		return list.stream().count();
	}
}

class GenericsType<T> {
	private T t;

	public T get() {
		return this.t;
	}

	public void set(T t1) {
		this.t = t1;
	}
}

class CommonUtility {
	
	public <T> long getObjectsCount(List<T> list) {
		return list.stream().count();
	}

	public <T> T DatatypeConvert(String[] Parse) {
		String FinBinVal = "";
		switch (Parse[0].toUpperCase()) {
		case "TONUMERIC":
			return (T) (Object) Integer.parseInt(Parse[1]);
		case "TOHEX":
			return (T) new BigInteger(Parse[1], 16).toString();
		case "TOSTRING":
			return (T) String.valueOf(Parse[1]);
		case "TODOUBLE":
			return (T) Double.valueOf(Parse[1]);
		default:
			return (T) (Object) 0;

		}
	}
}

class CommonUtility1 {
	public <T> Stream<T> getObjectsCount(List<T> list) {

		return list.stream().sorted();
		// return null;
	}
}

public class GenericsExample {

	public static void main(String[] args) {

		// 1.Provides type safety at compile time itself
		List<Integer> tempList = new ArrayList<>();

		tempList.add(25);
		// tempList.add("Sanjay");
		// tempList.add(16.75);

		for (int i = 0; i < tempList.size(); i++) {
			int val = (int) tempList.get(i);
			System.out.println(val);
		}

		// 2.Generic Method implemetation
		// Want o find biggest of 3 numbers
		System.out.println("\nWith out Generics...");
		System.out.println("Maximum Number is : " + new Maximum().maximum(4, 8, 6));
		System.out.println("Maximum Number is : " + new MaximumDouble().maximum(4.1, 8.5, 6.9));

		// Using Generics
		System.out.println("\nUsing Generics...");
		System.out.println("Maximum Number is : " + new MaximumGeneric().maximum(4, 8, 6));
		System.out.println("Maximum Number is : " + new MaximumGeneric().maximum(4.1, 8.5, 6.9));

		// 3.On real time Data/Objects
		System.out.println("\nWith out Generics...");
		List<Employee> employeeList = Arrays.asList(new Employee("1", "Ajay", 35, 35000, "HR", true),
				new Employee("2", "Vamshi", 45, 36000, "HR", false),
				new Employee("3", "Rajesh", 50, 50000, "IT", false), new Employee("4", "Akash", 54, 60000, "IT", true),
				new Employee("5", "Sanjay", 60, 70000, "ADMIN", true),
				new Employee("6", "Raju", 70, 80000, "ADMIN", true));

		List<Student> stuList = Arrays.asList(new Student("1", "Akshay", true), new Student("2", "Swamy", true),
				new Student("3", "Raghav", false));

		System.out.println(new EmployeeUtility().getEmployeesCount(employeeList));
		System.out.println(new StudentUtility().getStudentsCount(stuList));

		System.out.println("\nUsing Generics...");
		System.out.println(new CommonUtility().getObjectsCount(employeeList));
		System.out.println(new CommonUtility().getObjectsCount(stuList));
		
		int a = new CommonUtility().DatatypeConvert(new String[] {"TONUMERIC","7"});
		System.out.println(a);
		
		String b = new CommonUtility().DatatypeConvert(new String[] {"TOHEX","7"});
		System.out.println(b);


	}
}
