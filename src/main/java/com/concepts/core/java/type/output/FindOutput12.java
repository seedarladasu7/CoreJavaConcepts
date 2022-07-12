package com.concepts.core.java.type.output;

class First {
	public First() {
		System.out.println("a");
	}
}

class Second extends First {
	public Second() {
		System.out.println("b");
	}
}

class Third extends Second {
	public Third() {
		System.out.println("c");
	}
}

public class FindOutput12 {
	public static void main(String[] args) {
		new Third();
	}
}
