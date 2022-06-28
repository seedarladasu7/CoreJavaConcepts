package com.concepts.core.java.java8.functionalinterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PreDefFunctionalInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<Integer> predicate = (t) -> t > 5;
		System.out.println("Predicate" + predicate.test(1));

		Function<String, Integer> function1 = (e) -> e.length();
		System.out.println("Function: " + function1.apply("Hello there"));

		Consumer<String> conStr = (s) -> System.out.println(s);
		conStr.accept("Consumer: Hello There...");

		Supplier<String> suppStr = () -> "Hello There";
		System.out.println("Supplier:" + suppStr.get());

	}

}
