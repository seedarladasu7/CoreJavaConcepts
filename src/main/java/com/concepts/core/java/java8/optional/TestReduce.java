package com.concepts.core.java.java8.optional;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestReduce {	
	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Abcfd", "Bcd", "Cdessdc", "Defdcssd", "Ef");		
		Optional<String> reduced = strList.stream().collect(Collectors.minBy(Comparator.comparing(String::length)));		
		System.out.println(reduced.get());
	}	
}
