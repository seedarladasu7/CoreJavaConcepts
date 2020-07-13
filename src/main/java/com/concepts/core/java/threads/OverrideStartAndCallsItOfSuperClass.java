package com.concepts.core.java.threads;

class ThreadDemo extends Thread {
	
	public void start() {
		super.start();
		System.out.println("Start method of ThreadDemo");
	}
	
	public void run() {
		System.out.println("Run method of ThreadDemo");
	}
}

public class OverrideStartAndCallsItOfSuperClass {
	
	public static void main(String[] args) {
		ThreadDemo td = new ThreadDemo();
		td.start();
		System.out.println("main method...");
	}
}