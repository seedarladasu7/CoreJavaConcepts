package com.concepts.core.java.collections.map;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMapKeys {

	public static void main(String[] args) {

		System.out.println("Sorting using TreeMap\n");

		sortByKeyUsingTreeMap();

		System.out.println("\nSorting using Java8 streams\n");

		sortByKeyJava8Stream();
	}

	private static void sortByKeyUsingTreeMap() {
		Map<String, Integer> unSortedMap = getUnSortedMap();

		System.out.println("Unsorted Map: " + unSortedMap);

		Map<String, Integer> sortedMap = new TreeMap<String, Integer>(unSortedMap);

		System.out.println("Sorted Map: " + sortedMap);

		Map<String, Integer> reverseSortedMap = new TreeMap<String, Integer>(Collections.reverseOrder());
		reverseSortedMap.putAll(unSortedMap);

		System.out.println("Reverse Sorted Map: " + reverseSortedMap);
	}

	private static void sortByKeyJava8Stream() {
		Map<String, Integer> unSortedMap = getUnSortedMap();

		System.out.println("Unsorted Map: " + unSortedMap);

		LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
		unSortedMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));

		System.out.println("Sorted Map: " + sortedMap);

		LinkedHashMap<String, Integer> reverseSortedMap = new LinkedHashMap<>();
		unSortedMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
				.forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));

		System.out.println("Reverse Sorted Map: " + reverseSortedMap);
	}

	private static Map<String, Integer> getUnSortedMap() {
		Map<String, Integer> unsortedMap = new HashMap<>();
		unsortedMap.put("alex", 1);
		unsortedMap.put("david", 2);
		unsortedMap.put("elle", 3);
		unsortedMap.put("charles", 4);
		unsortedMap.put("brian", 5);
		return unsortedMap;
	}
}
