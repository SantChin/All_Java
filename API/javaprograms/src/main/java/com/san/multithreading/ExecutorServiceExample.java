package com.san.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// ExecuterService --> It provides thread pool  facilities to java applications
// Task executed by threads async 
// async means you can move to next instruction/line without finishing the current instruction/line 

//Types of thred pools in executor service
//1.fixedThreadpool - It uses Blocking queue
//2.CachedThreadpool
//3.ScheduledThreadpool
//4.SingleThreadpool

class Task implements Runnable {

	int i;

	Task(int i) {
		this.i = i;
	}

	public void run() {
		// if(i == 50)
		// Thread.currentThread().destroy();
		System.out.println("Task --> " + i + " Thread Name :" + Thread.currentThread().getName());
	}

}

class Task12 implements Callable<Integer> {

	int i;

	Task12(int i) {
		this.i = i;
	}

	public void run() {

	}

	public Integer call() throws Exception {
		Thread.sleep(1000);
		System.out.println("Task --> " + i + " Thread Name :" + Thread.currentThread().getName());
		return 3;
	}

}

public class ExecutorServiceExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		// int cores = Runtime.getRuntime().availableProcessors();
		// System.out.println(cores);

		// for(int i=1;i<=100;i++) {
		// Thread t1 = new Thread(new Task(i));
		// t1.start();
		// }

		// Thread Pool --> ExecuterService
		// ExecutorService service = Executors.newFixedThreadPool(5); // Created a fixed
		// thread pool of 5

		// Cached Thread Pool.
		// If all the threads are busy...and no thread is available, on demand it will
		// cretae one thread and assign the task to the thread.
		// this makes use of synchronus queue // at time it holds 1 task in its queue
		// If any thread is idle for more than 60 senconds , then it will kill that
		// thread.
		// If all taks are completed then it size starts shirinking

		// ExecutorService service = Executors.newCachedThreadPool();

		// for(int i=1;i<=100;i++) {
		// service.execute(new Task(i));
		// }

		// ScheduledExecutorService service = Executors.newScheduledThreadPool(5);

		// ScheduledThreadPool
		// 1. It uses delay queue
		// 2.we have 3 methods here like
		// 1.service.schedule
		// 2.service.scheduleAtFixedRate
		// 3.service.scheduleWithFixedDelay

		// Runs Task After 10 seconds
		// service.schedule(new Task(1), 10, TimeUnit.SECONDS);

		// Runs Task for every 5 seconds. //At fixed Interval
		// service.scheduleAtFixedRate(new Task(1), 10, 5, TimeUnit.SECONDS);

		// It Runs task after completing previous task
		// service.scheduleWithFixedDelay(new Task(1), 5, 3, TimeUnit.SECONDS);

		// SingleThreadpool
		// 1. Thread is created and used the same thread for task execution
		// 2. it also uses blocking queue
		// 3.if thread is killed abnormally, it creates new thread and finsihes the
		// tasks

//		ExecutorService service = Executors.newSingleThreadExecutor();
//		for (int i = 1; i <= 100; i++) {
//			service.execute(new Task(i));
//		}
		
		
		ExecutorService service = Executors.newFixedThreadPool(5);
		Future<Integer> future = service.submit(new Task12(1)); // Async
		
		// Here u can perform un related operations
		for(int i =1;i<=5;i++)
			System.out.println(i);
		
		Integer val = future.get(); // main thread is blocked
		System.out.println(val);
		
		System.out.println("Main Completed");
		
		//Methods :
		//1.future.camcel
		//2.future.isCancelled();
		//3.future.isDone()
		
		
		// service.shutdown();

	}
}
