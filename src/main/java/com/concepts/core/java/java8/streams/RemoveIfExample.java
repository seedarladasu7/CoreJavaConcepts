package com.concepts.core.java.java8.streams;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class RemoveIfExample {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Seedarla");
		list.add("Mariya");
		list.add("Dasu");
		list.add("MCA");
		list.add("BSc");
		list.add("MPC");
		
		withArrayDeque(list);
		
		System.out.println("");
		
		withList(list);
	}
	
	private static void withArrayDeque(List<String> list) {
		ArrayDeque<String> names = new ArrayDeque<>(list);
		names.removeIf(n -> n.startsWith("Mariya"));
		System.out.println(names);
		
	}
	
	private static void withList(List<String> list) {
		list.removeIf(n -> n.startsWith("Mariya"));
		System.out.println(list);		
	}

}
