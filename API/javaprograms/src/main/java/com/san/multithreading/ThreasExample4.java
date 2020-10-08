package com.san.multithreading;

import java.sql.Timestamp;

public class ThreasExample4 {

	public static void main(String[] args) {
		
		Timestamp startTime = new Timestamp(System.currentTimeMillis());
		
		System.out.println("Task1 Started");
		for (int i = 101; i <= 199; i++)
			System.out.print(i + " ");
		System.out.println("\nTask1 Done");
		
		
		System.out.println("Task2 Started");
		for (int i = 201; i <= 299; i++)
			System.out.print(i + " ");
		System.out.println("\nTask2 Done");
		
		System.out.println("Task3 Started");
		for (int i = 301; i <= 399; i++)
			System.out.print(i + " ");
		System.out.println("\nTask3 Started");

		Timestamp endTime = new Timestamp(System.currentTimeMillis());

		System.out.println("Total time taken " + (endTime.getTime() - startTime.getTime()));

	}

}
