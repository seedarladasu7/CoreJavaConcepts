package com.concepts.core.java.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOfWordsInAString {

	public static void main(String[] args) {

		String word = "Hello Hi There Hi Hello Hey";

		List<String> wordsList = Arrays.asList(word.split(" "));

		Map<String, Long> collect = wordsList.stream()
				.collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting()));

		collect.forEach((e, i) -> System.out.println(e + "=" + i));

		System.out.println("=============================================");
		Map<String, Integer> collect1 = wordsList.stream()
				.collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.summingInt(e -> 1)));

		collect1.forEach((e, i) -> System.out.println(e + "=" + i));
	}

}
