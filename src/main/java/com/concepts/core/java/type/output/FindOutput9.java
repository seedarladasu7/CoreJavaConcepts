package com.concepts.core.java.type.output;

//Class 1
//Helper class
class Test1 {

	// Constructor of this class
	Test1(int x) {

		// Print statement whenever this constructor is
		// called
		System.out.println("Constructor called " + x);
	}
}

//Class 2
//Class contains an instance of Test1
//Main class
public class FindOutput9 {

	// Creating instance(object) of class1 in this class
	Test1 t1 = new Test1(10);

	// Constructor of this class
	FindOutput9(int i) {
		t1 = new Test1(i);
	}

	// Main driver method
	public static void main(String[] args) {
		// Creating instance of this class inside main()
		FindOutput9 t2 = new FindOutput9(5);
	}
}
