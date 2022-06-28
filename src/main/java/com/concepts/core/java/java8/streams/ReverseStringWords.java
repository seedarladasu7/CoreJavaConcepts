package com.concepts.core.java.java8.streams;

import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseStringWords {

	public static void main(String[] args) {
		Stream.of("one", "two", "three", "four", "five", "six").collect(reversed()).forEach(System.out::println);
		/*
		 * List<String> strList = Arrays.asList("one", "two", "three", "four", "five",
		 * "six"); Collections.reverse(strList);
		 * strList.stream().forEach(System.out::println);
		 */
	}

	public static <T> Collector<T, ?, Stream<T>> reversed() {
		return Collectors.collectingAndThen(Collectors.toList(), list -> {
			Collections.reverse(list);
			return list.stream();
		});
	}

}
