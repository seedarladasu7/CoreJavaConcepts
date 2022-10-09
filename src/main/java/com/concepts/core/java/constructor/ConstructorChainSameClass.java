package com.concepts.core.java.constructor;

public class ConstructorChainSameClass {

		//default constructor  
	ConstructorChainSameClass() {
		this("One");
		System.out.println("Default constructor called.");
	}

	// one parameterized constructor
	ConstructorChainSameClass(String str) {
		this(str, "Two");
		System.out.println("Parameterized constructor called: " + str);
	}
	
	// multi parameterized constructor
	ConstructorChainSameClass(String str1, String str2) {
		System.out.println("Multi Parameterized constructor called: " + str1 + ", " + str2);
	}

	// main method
	public static void main(String args[]) {
		// initializes the instance of example class
		ConstructorChainSameClass cc = new ConstructorChainSameClass();
	}
	

}
