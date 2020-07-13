package com.concepts.core.java.java8.functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceExample {
	static int result;
	static float mulResult;
	static void addList(List<Integer> list) {
		result = list.stream().mapToInt(Integer::intValue).sum();
	}

	static void multiplication(Integer intV) {
		mulResult = 100 * intV;
	}
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		Consumer<List<Integer>> consumer = ConsumerInterfaceExample::addList;
		consumer.accept(list);
		System.out.println("Result is: "+result);
		
		int intVal = 200;
		Consumer<Integer> mulConsumer = ConsumerInterfaceExample::multiplication;
		mulConsumer.accept(intVal);
		System.out.println("mulResult is: "+mulResult);
		
		//Consumer<String> strConsumer = 
	}
}
