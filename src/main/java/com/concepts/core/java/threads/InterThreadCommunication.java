package com.concepts.core.java.threads;

class TestProgram {
	int num;
	boolean valueSet = false;
	
	public synchronized void put(int num) {
		while(valueSet) {
			try {
				wait();
			} catch (Exception e) { 
				
			}
		}
		System.out.println("Put: "+num);
		this.num = num;
		valueSet = true;
		notify();
	}
	
	public synchronized void get() {
		while(!valueSet) {
			try {
				wait();
			} catch (Exception e) { 
				
			}
		}
		System.out.println("Get: "+num);
		valueSet = false;
		notify();
	}
}
//class Producer {}
//class Consumer {}
public class InterThreadCommunication {
	
	public static void main(String[] args) {
		
	}

}
