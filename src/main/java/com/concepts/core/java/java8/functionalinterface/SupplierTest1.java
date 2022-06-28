package com.concepts.core.java.java8.functionalinterface;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierTest1 {

	public static void main(String[] args) {
		SupplierTest1 supTest = new SupplierTest1();
		supTest.test_Supplier();
	}

	public void test_Supplier() {
		// (1) Using the Supplier interface, there is only one get method, no
		// parameters, and a value is returned.
		Supplier<String> supplier = new Supplier<String>() {
			@Override
			public String get() {
				// Returns a random value
				return Integer.toString(new Random().nextInt());
			}
		};

		System.out.println(supplier.get());

		System.out.println("********************");

		// (2) Using lambda expression,
		supplier = () -> Integer.toString(new Random().nextInt());
		System.out.println(supplier.get());
		System.out.println("********************");

		// (3) Use method quotation
		Supplier<Double> supplier2 = Math::random;
		System.out.println(supplier2.get());
		
		
		Supplier<String> suppStr = () -> "Hello There";
		
		System.out.println(suppStr.get());
	}
}
