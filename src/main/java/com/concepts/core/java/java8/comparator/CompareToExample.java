package com.concepts.core.java.java8.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CompareToExample {
	
	public static void main(String[] args) {
		List<String> strings = Arrays
		        .asList("how", "to", "do", "in", "java", "dot", "com");
		 
		List<String> sorted = strings
		        .stream()
		        .sorted((s1, s2) -> s1.compareTo(s2))
		        .collect(Collectors.toList());
		 
		System.out.println(sorted);
		 
		List<String> sortedAlt = strings
		        .stream()
		        .sorted(String::compareTo)
		        .collect(Collectors.toList());
		 
		System.out.println(sortedAlt);
		
		Comparator<String> comp = (o1, o2) -> o1.compareTo(o2);
		List<String> reverseOrd = sortedAlt
				.stream()
				.sorted(comp.reversed())
				.collect(Collectors.toList());
		
		System.out.println(reverseOrd);
	}

}
