package com.san.javaprograms;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerUsingBlockingQueue {

	public static void main(String args[]) {
		
		// Create a Blocking queue
		
		BlockingQueue<Message> queue = new ArrayBlockingQueue<Message>(10);
		Producer producer = new Producer(queue);
		Consumer consumer = new Consumer(queue);
		
		//Start As threads
		new Thread(producer).start();
		new Thread(consumer).start();
	}
}

class Message {
	String msg;

	public Message(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}
}

class Producer implements Runnable {

	private BlockingQueue<Message> queue;

	public Producer(BlockingQueue<Message> queue) {
		this.queue = queue;
	}

	public void run() {

		for (int i = 0; i < 25; i++) {
			Message msg = new Message("" + i);

			try {
				Thread.sleep(i);
				queue.put(msg);
				System.out.println("Produced " + msg.getMsg());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		Message msg = new Message("exit");
		try {
			queue.put(msg);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}

class Consumer implements Runnable {

	private BlockingQueue<Message> queue;

	public Consumer(BlockingQueue<Message> queue) {
		this.queue = queue;
	}

	public void run() {
		try {
			Message msg;

			while ((msg = queue.take()).getMsg() != "exit") {
				Thread.sleep(100);
				System.out.println("Consumed " + msg.getMsg());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}