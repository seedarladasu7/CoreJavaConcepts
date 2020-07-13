package com.concepts.core.java.java8.streams;

import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseStringsList {
	
	public static void main(String[] args) {
		
		ReverseStringsList.orderingStringArrayElements();
	}

	public static void reverseStringsArray() {
		 Stream.of("One", "Two", "Three", "Four")
         .collect(Collectors.toCollection(LinkedList::new))
         .descendingIterator().forEachRemaining(System.out::println);
	}
	
	public static void orderingStringArrayElements() {

	    Stream.of("One", "Two", "Three", "Four")
	            //.sorted(Collections.reverseOrder())
	            .sorted()
	            .forEach(System.out::println);

	}

}
