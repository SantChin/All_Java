package com.san.exeutorFramework;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Task implements Runnable {

	int i;

	Task(int i) {
		this.i = i;
	}

	public void run() {
		System.out.println("Thread Value=" + i + " -- > Thread Name " + Thread.currentThread().getName());
	}

}

public class ExecutorExample1 {

	public static void main(String args[]) {

		//int cores = Runtime.getRuntime().availableProcessors();
		//System.out.println(cores);

//		for(int i=0 ;i<25;i++) {
//			Thread t1 = new Thread(new Task(i));
//			t1.start();
//		}

		//ExecutorService service = Executors.newFixedThreadPool(cores);
		//ExecutorService service = Executors.newCachedThreadPool();
		
		//for (int i = 0; i < 25; i++) {
		//	service.execute(new Task(i));
		//}
		
		//for Scheduling of Tasks
		ScheduledExecutorService service = Executors.newScheduledThreadPool(10);
		
		//task to run after 10 seconds delay
		//service.schedule(new Task(1), 15, TimeUnit.SECONDS);
		
		//task to run repeatedly for every 10 seconds
		//service.scheduleAtFixedRate(new Task(1), 5, 5, TimeUnit.SECONDS);

		//It will wait for previous task to complete and wait 10 more seconds to run
		service.scheduleWithFixedDelay(new Task(1), 5, 10, TimeUnit.SECONDS);
		
		//System.out.println("Main Thread " + Thread.currentThread().getName());

	}

}
