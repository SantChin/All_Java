package com.san.multithreading;


class Message2 {
	
	int i;
	boolean flag = false;
	
	public synchronized  void set(int i) throws InterruptedException {
		while(flag) {
			wait();
		}
		this.i = i;
		flag =true;
		System.out.println("Produced produced----> " + i);
		notify();
	}
	
	public synchronized void get() throws InterruptedException {
		while(!flag) {
			wait();
		}
		flag =false;
		System.out.println("Consumer consumed----> " + i);
		notify();
	}
}


class Producer4 implements Runnable {

	
	private Message2 msg2;
	
	Producer4(Message2 msg2) {
		
	}
	
	public void run() {
		
		while(true) {
			
		}
		
	}
	
}


class Consumer4 implements Runnable{

	public void run() {
		while (true) {
			
		}
		
	}
	
}

public class InterThreadCommunication4 {
	
	
	
	

}
