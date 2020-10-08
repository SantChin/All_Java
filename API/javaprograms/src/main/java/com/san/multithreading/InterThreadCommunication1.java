package com.san.multithreading;

import java.util.LinkedList;

class Producer implements Runnable {

	private LinkedList<String> list;
	int capacity = 1; 

	public Producer(LinkedList<String> list) {
		this.list = list;
	}

	public void run() {
		int value = 0; 
		while (true) { 
			synchronized (this) 
			{ 
				// producer thread waits while list 
				// is full 
				while (list.size() == capacity)
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 

				System.out.println("Producer produced-"
								+ value); 
				value = value++;
				// to insert the jobs in the list 
				list.add(value + ""); 

				// notifies the consumer thread that 
				// now it can start consuming 
				notify(); 

				// makes the working of program easier 
				// to understand 
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			} 
		} 
	}

}

class Consumer implements Runnable {

	private LinkedList<String> list;

	public Consumer(LinkedList<String> list) {
		this.list = list;
	}

	public void run() {
		while (true) { 
			synchronized (this) 
			{ 
				// consumer thread waits while list 
				// is empty 
				while (list.size() == 0)
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 

				// to retrive the ifrst job in the list 
				String val = list.removeFirst(); 

				System.out.println("Consumer consumed-"
								+ val); 

				// Wake up producer thread 
				notify(); 

				// and sleep 
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			} 
		} 
	}

}

public class InterThreadCommunication1 {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();

		Producer producer = new Producer(list);
		Consumer consumer = new Consumer(list);

		// Start As threads
		new Thread(producer).start();
		new Thread(consumer).start();

	}

}
