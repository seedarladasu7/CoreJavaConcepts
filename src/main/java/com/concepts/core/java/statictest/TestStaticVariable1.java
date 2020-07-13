package com.concepts.core.java.statictest;

public class TestStaticVariable1 {
	
	private static int i;
	
	static {
		i = 10;
		System.out.println("Static block");
	}
	
	public static void main(String[] args) {
		i = i+1;
		System.out.println("Main method: "+i);		
	}

}
