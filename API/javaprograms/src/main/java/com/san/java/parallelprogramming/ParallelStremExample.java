package com.san.java.parallelprogramming;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelStremExample {

	
	public static void main(String[] args) {
		
		
		long start = 0;
		long end = 0;
//		start = System.currentTimeMillis();
//		IntStream.range(1, 100000).forEach(System.out::println);
//		end = System.currentTimeMillis();
//		System.out.println("Palin Stream Time taken " +(end - start));
		
		
		long start1 = 0;
		long end1 = 0;
//		start1 = System.currentTimeMillis();
//		IntStream.range(1, 100000).parallel().forEach(System.out::println);
//		end1 = System.currentTimeMillis();
//		System.out.println("Parallel Stream Time taken " +(end1 - start1));
		
		
		
//		IntStream.range(1,10).forEach(x->{
//			System.out.println("ThreadName : "+Thread.currentThread().getName());
//		});
//		
//		IntStream.range(1,10).parallel().forEach(x->{
//			System.out.println("Thread Name " + Thread.currentThread().getName());
//		});
		
		List<Employee> listEmployees = EmployeeDatabase.getListOfEmployees();
		
		
		//Normal
		
		start = System.currentTimeMillis();
		double normalStreamOutPut = listEmployees.stream().map(Employee::getSalary).mapToDouble(i->i).average().getAsDouble();
		end = System.currentTimeMillis();
		System.out.println("Normal Stream Time taken " +(end - start) + "  : Avg sal "+ normalStreamOutPut);
		
		
		
		start = System.currentTimeMillis();
		double parallelStreamOutPut = listEmployees.parallelStream().map(Employee::getSalary).mapToDouble(i->i).average().getAsDouble();
		end = System.currentTimeMillis();
		System.out.println("Parallel Stream Time taken " +(end - start) + "  : Avg sal "+ parallelStreamOutPut);
		
		
		
		
		
		
	}
}
