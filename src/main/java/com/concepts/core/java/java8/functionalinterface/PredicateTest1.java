package com.concepts.core.java.java8.functionalinterface;

import java.util.function.Predicate;

public class PredicateTest1 {

	public static void main(String[] args) {
		PredicateTest1 predTest = new PredicateTest1();
		predTest.test_Predicate();
	}

	public void test_Predicate() {
		// (1) Using the Predicate interface, there is only one test method, passing in
		// a parameter and returning a bool value.
		Predicate<Integer> predicate = new Predicate<Integer>() {
			@Override
			public boolean test(Integer integer) {
				if (integer > 5) {
					return true;
				}
				return false;
			}
		};

		System.out.println(predicate.test(6));

		System.out.println("********************");

		// (2) Using lambda expression,
		predicate = (t) -> t > 5;
		System.out.println(predicate.test(1));
		System.out.println("********************");

	}

}
