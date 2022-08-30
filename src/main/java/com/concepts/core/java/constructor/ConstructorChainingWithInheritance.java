package com.concepts.core.java.constructor;

//parent class or base class  
class CCDemo {
//base class default constructor  
	CCDemo() {
		this(80, 90);
		System.out.println("Base class default constructor called");
	}

//base class parameterized constructor  
	CCDemo(int x, int y) {
		System.out.println("Base class parameterized constructor called");
	}
}

//derived class or child class  
class CCPrototype extends CCDemo {
//derived class default constructor  
	CCPrototype() {
		this("Java", "Python");
		System.out.println("Derived class default constructor called");
	}

//derived class parameterized constructor  
	CCPrototype(String str1, String str2) {
		super();
		System.out.println("Derived class parameterized constructor called");
	}
}

public class ConstructorChainingWithInheritance {
//main method  
	public static void main(String args[]) {
//initializes the instance of example class  
		CCPrototype myExample = new CCPrototype();
	}
}