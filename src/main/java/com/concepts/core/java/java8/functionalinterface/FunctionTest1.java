package com.concepts.core.java.java8.functionalinterface;

import java.util.function.Function;
import java.util.stream.Stream;

public class FunctionTest1 {

	public static void main(String[] args) {

		FunctionTest1 funcTest = new FunctionTest1();
		funcTest.test_Function();
	}

	public void test_Function() {
		// (1) Using map method, the first parameter of generics is the type before
		// conversion and the second is the type after conversion.
		Function<String, Integer> function = new Function<String, Integer>() {
			@Override
			public Integer apply(String s) {
				return s.length();// Gets the length of each string and returns
			}
		};

		Stream<String> stream = Stream.of("aaa", "bbbbb", "ccccccv");
		Stream<Integer> stream1 = stream.map(function);
		stream1.forEach(System.out::println);

		System.out.println("********************");
		
		Function<String, Integer> function1 = (e) -> e.length();
		
		System.out.println(function1.apply("Hello there"));

	}
}
