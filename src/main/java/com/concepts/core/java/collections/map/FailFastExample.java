package com.concepts.core.java.collections.map;

import java.util.ArrayList;
//Java code to illustrate Fail Fast Iterator in Java 
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFastExample {
	public static void main(String[] args) {

		//failFastExample1();
		failFastExample2();

	}

	private static void failFastExample1() {
		Map<String, String> cityCode = new HashMap<String, String>();
		cityCode.put("Delhi", "India");
		cityCode.put("Moscow", "Russia");
		cityCode.put("New York", "USA");

		Iterator iterator = cityCode.keySet().iterator();

		while (iterator.hasNext()) {
			System.out.println(cityCode.get(iterator.next()));
			// adding an element to Map exception will be thrown on next call of next()
			// method.
			cityCode.put("Istanbul", "Turkey");
		}
	}

	private static void failFastExample2() {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);

		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			if (itr.next() == 2) {
				// will not throw Exception
				itr.remove();
			}
		}

		System.out.println(al);

		itr = al.iterator();
		while (itr.hasNext()) {
			if (itr.next() == 3) {
				// will throw Exception on
				// next call of next() method
				al.remove(3);
			}
		}
	}
}
