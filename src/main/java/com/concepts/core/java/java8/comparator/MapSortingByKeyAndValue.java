package com.concepts.core.java.java8.comparator;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapSortingByKeyAndValue {

	public static void main(String[] args) {
		System.out.println("\nSorting using Java8 streams\n");

		System.out.println("##############Comparing by Keys################");
		sortByKeyJava8Stream();
		System.out.println("##############################################\n\n\n\n");
		
		System.out.println("##############Comparing by values################");
		sortByValueJava8Stream();
		System.out.println("##############################################");
	}
	
	private static void sortByKeyJava8Stream() {
		Map<String, Integer> unSortedMap = getUnSortedMap();

		System.out.println("Unsorted Map : " + unSortedMap);

		LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
		unSortedMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));

		System.out.println("Sorted Map (SortByKey)  : " + sortedMap);

		LinkedHashMap<String, Integer> reverseSortedMap = new LinkedHashMap<>();
		unSortedMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
				.forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));

		System.out.println("Reverse Sorted Map (SortByKey)  : " + reverseSortedMap);
	}

	private static void sortByValueJava8Stream() {
		Map<String, Integer> unSortedMap = getUnSortedMap();

		System.out.println("Unsorted Map : " + unSortedMap);

		LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
		unSortedMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));

		System.out.println("Sorted Map (SortByValue)  : " + sortedMap);

		LinkedHashMap<String, Integer> reverseSortedMap = new LinkedHashMap<>();
		unSortedMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));

		System.out.println("Reverse Sorted Map (SortByValue)  : " + reverseSortedMap);
	}

	private static Map<String, Integer> getUnSortedMap() {
		Map<String, Integer> unsortMap = new HashMap<>();
		unsortMap.put("alex", 1);
		unsortMap.put("david", 2);
		unsortMap.put("elle", 3);
		unsortMap.put("charles", 4);
		unsortMap.put("brian", 5);
		return unsortMap;
	}
}