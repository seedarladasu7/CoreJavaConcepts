package com.concepts.core.java.collections.map;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
//Java code to illustrate Fail Safe Iterator in Java 
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeExample {
	public static void main(String args[]) {
		// failSafeMethod1();
		failSafeMethod2();
	}

	private static void failSafeMethod1() {
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>(new Integer[] { 1, 3, 5, 8 });
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			Integer no = (Integer) itr.next();
			System.out.println(no);
			if (no == 8) {
				list.add(14); // This will not print hence it has created separate copy
			}
		}
	}

	private static void failSafeMethod2() {
		// Creating a ConcurrentHashMap
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();

		map.put("ONE", 1);
		map.put("TWO", 2);
		map.put("THREE", 3);
		map.put("FOUR", 4);

		// Getting an Iterator from map
		Iterator it = map.keySet().iterator();

		while (it.hasNext()) {
			String key = (String) it.next();
			System.out.println(key + " : " + map.get(key));
			map.put("SEVEN", 7); // This will reflect in iterator. Hence, it has not created separate copy
		}
	}
}
