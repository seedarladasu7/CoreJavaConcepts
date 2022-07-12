package com.concepts.core.java.type.output;

public class FindOutput14 extends Thread {
	public void run() {
		System.out.print("Hello...");
	}

	public static void main(String args[]) {
		FindOutput14 t1 = new FindOutput14();
		t1.start();
		t1.stop();
		t1.start();
	}
}