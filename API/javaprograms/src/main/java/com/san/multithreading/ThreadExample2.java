package com.san.multithreading;

import java.sql.Timestamp;

class Task11 extends Thread {

	public void run() {

		System.out.println("Task1 Started");
		for (int i = 101; i <= 199; i++)
			System.out.print(i + " ");
		System.out.println("\nTask1 Done"); //DEAD/TERMINATED
	}
}

class Task22 implements Runnable {

	public void run() {

		System.out.println("Task2 Started");
		for (int i = 201; i <= 299; i++)
			System.out.print(i + " ");
		System.out.println("\nTask2 Done");
	}

}

public class ThreadExample2 {

	public static void main(String[] args) throws InterruptedException {

		Timestamp startTime = new Timestamp(System.currentTimeMillis());

		
		Task11 t1 = new Task11(); //NEW
		t1.start();
		
		
		Task22 t2 = new Task22();
		Thread t21 = new Thread(t2);
		t21.start();
		
		t1.join();
		t21.join();
		
		System.out.println("Task3 Started");
		for (int i = 301; i <= 399; i++)
			System.out.print(i + " ");
		System.out.println("\nTask3 Started");

		Timestamp endTime = new Timestamp(System.currentTimeMillis());

		System.out.println("Total time taken " + (endTime.getTime() - startTime.getTime()));
	}

}
