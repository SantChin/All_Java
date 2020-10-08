package com.san.multithreading;

class Sample1 extends Thread {

	public void run() {
		System.out.println("running thread name is:" + Thread.currentThread().getName());
		System.out.println("running thread priority is:" + Thread.currentThread().getPriority());
	}
}

class Sample2 extends Thread {

	public void run() {
		System.out.println("running thread name is:" + Thread.currentThread().getName());
		System.out.println("running thread priority is:" + Thread.currentThread().getPriority());
	}
}

public class ThreadPriority {

	public static void main(String args[]) {
		Sample1 m1 = new Sample1();
		Sample2 m2 = new Sample2();
		
		m1.setName("Sampel 1");
		m2.setName("Sample 2");
		
		m1.setPriority(Thread.MIN_PRIORITY);
		m2.setPriority(Thread.MAX_PRIORITY);
		m1.start();
		//m1.start();
		m2.start();
	}

}
