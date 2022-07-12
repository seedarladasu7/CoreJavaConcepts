package com.concepts.core.java.type.output;

public class FindOutput1 {

	public static void main(String[] args) {
		try {
			badMethod();
			System.out.print("A");
		} catch (Exception e) {
			System.out.print("B");
		} finally {
			System.out.print("C");
		}
		System.out.print("D");
	}

	public static void badMethod() {
		throw new RuntimeException();
	}

}
