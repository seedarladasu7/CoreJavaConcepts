package com.concepts.core.java.java8.streams;

import java.util.Date;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GenereteAndIterateExample {

	public static void main(String[] args) {
		
		// Generate Example
		Stream.generate(Date::new)
		.limit(10)
		.collect(Collectors.toList())
		.stream()
		.forEach(System.out::println);
		System.out.println("");
		
		//Iterate Example
		Stream.iterate(0, i -> i+2)
		.skip(5)
		.limit(10)
		.forEach(System.out::println);
		System.out.println("");
		
		//Iterate Example2
		Stream.iterate(0, i -> i+2)
		.limit(10)
		.skip(5)		
		.collect(Collectors.toList())
		.stream()
		.forEach(System.out::println);
	}
}
