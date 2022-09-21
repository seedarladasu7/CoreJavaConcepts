package com.concepts.core.java.threads;

public class ProducerConsumerTest {
	public static void main(String[] args) {
		SmallEnclosedSpace s = new SmallEnclosedSpace();
		Producer p1 = new Producer(s, 1);
		Consumer c1 = new Consumer(s, 1);
		p1.start();
		c1.start();
	}
}

class SmallEnclosedSpace {
	private int contents;
	private boolean available = false;

	public synchronized int get() {
		while (available == false) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		available = false;
		notifyAll();
		return contents;
	}

	public synchronized void put(int value) {
		while (available == true) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		contents = value;
		available = true;
		notifyAll();
	}
}

class Consumer extends Thread {
	private SmallEnclosedSpace sES;
	private int number;

	public Consumer(SmallEnclosedSpace s, int number) {
		sES = s;
		this.number = number;
	}

	public void run() {
		int value = 0;
		for (int i = 0; i < 10; i++) {
			value = sES.get();
			System.out.println("Consumer #" + this.number + " got: " + value);
		}
	}
}

class Producer extends Thread {
	private SmallEnclosedSpace sES;
	private int number;

	public Producer(SmallEnclosedSpace s, int number) {
		sES = s;
		this.number = number;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			sES.put(i);
			System.out.println("Producer #" + this.number + " put: " + i);
			try {
				sleep((int) (Math.random() * 100));
			} catch (InterruptedException e) {
			}
		}
	}
}
