package com.concepts.core.java.constructor;

public class ConstructorChainSameClass {

		//default constructor  
	ConstructorChainSameClass() {
		this("Javatpoint");
		System.out.println("Default constructor called.");
	}

	// one parameterized constructor
	ConstructorChainSameClass(String str) {
		this("Javatpoint", "Javatpoint");
		System.out.println("Parameterized constructor called");
	}
	
	// multi parameterized constructor
	ConstructorChainSameClass(String str1, String str2) {
		System.out.println("Multi Parameterized constructor called");
	}

	// main method
	public static void main(String args[]) {
		// initializes the instance of example class
		ConstructorChainSameClass cc = new ConstructorChainSameClass();
	}
	

}
