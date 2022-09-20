package com.concepts.core.java.immutability;

//Java Program to Demonstrate that Primitive Wrapper Classes are Immutable

public class PrimitiveWrapperClassesAreImmutableEx {

	public static void main(String[] args) {
		Integer i = new Integer(12);
		System.out.println(i);
		modify(i);
		System.out.println(i);
	}

	private static void modify(Integer i) {
		i = i + 1;
	}
}
