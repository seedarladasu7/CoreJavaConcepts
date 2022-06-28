package com.concepts.core.java.java8.streams;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortMapElements {

	// Function to get Stream of map mappings
	private static Stream<Map.Entry<String, String>> getMapStream() {
		Map<String, String> vehicle = new HashMap<>();
		vehicle.put("CAR", "Audi");
		vehicle.put("BIKE", "Harley Davidson");

		return vehicle.entrySet().stream();
	}

	// Program to convert Stream to a Map in Java 8
	public static void main(String args[]) {
		// get map stream
		Stream<Map.Entry<String, String>> stream = getMapStream();

		// construct a new map from the stream
		Map<String, String> map = stream.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		Comparator<Map.Entry<String, String>> keyComparator = Map.Entry.comparingByKey(Collections.reverseOrder());
		
		map.entrySet().stream().sorted(keyComparator).forEachOrdered(System.out::println);

		//System.out.println(map);
	}
}
