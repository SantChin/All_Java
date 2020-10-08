package com.san.javaprograms;

class Producer2 implements Runnable {

	private Message1 msg;

	Producer2(Message1 msg) {
		this.msg = msg;
		Thread Producer = new Thread(this, "producer");
		Producer.start();
	}

	public void run() {
		int i=0;
		while (true && i <= 25) {
			try {
				msg.set(i++);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

class Consumer2 implements Runnable {

	private Message1 msg;

	Consumer2(Message1 msg) {
		this.msg = msg;
		Thread consumer = new Thread(this, "consumer");
		consumer.start();
	}

	public void run() {
		while (true) {
			try {
				msg.get();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

class Message1 {
	int i;
	boolean flag = false;

	public synchronized void set(int i) throws InterruptedException {
		while (flag) {
			wait();
		}

		this.i = i;
		flag = true;
		System.out.println("Produced ---> " + i);
		notify();
	}

	public synchronized void get() throws InterruptedException {
		while (!flag) {
			wait();
		}
		flag = false;
		System.out.println("Consumed ---> " + i);
		notify();
	}

}

public class InterThreadComm {

	public static void main(String[] args) {
		Message1 msg =  new Message1();
		new Producer2(msg);
		new Consumer2(msg);
		

	}

}
