package com.concepts.core.java.java8.optional;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestReduce {	
	public static void main(String[] args) {
		intReduce();
		stringReduce();
	}
	
	private static void intReduce() {
		List<Integer> strList = Arrays.asList(25,237883,3,4393,2377823,663, 5422, 0, -10,26, 3);		
		Optional<Integer> reduced = strList.stream().collect(Collectors.maxBy(Comparator.comparing(Integer::intValue)));		
		System.out.println("intReduce: " + reduced.get());
	}

	private static void stringReduce() {
		List<String> strList = Arrays.asList("Abcfd", "Bcd", "Cdessdc", "Defdcssd", "Ef");		
		Optional<String> reduced = strList.stream().collect(Collectors.minBy(Comparator.comparing(String::length)));		
		System.out.println("stringReduce: " + reduced.get());
	}	
}
