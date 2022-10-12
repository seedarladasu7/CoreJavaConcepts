package com.concepts.core.java.java8.functionalinterface;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerTest1 {

	public static void main(String[] args) {
		ConsumerTest1 cTest = new ConsumerTest1();
		cTest.test_Consumer();
	}

	public void test_Consumer() {
		// 1. Implementing Method with consumer Interface
		Consumer<String> consumer = new Consumer<String>() {

			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		};
		Stream<String> stream = Stream.of("aaa1", "bbb1", "ddd1", "ccc1", "fff1");
		stream.forEach(consumer);

		System.out.println("********************");

		// (2) Using lambda expression, forEach method needs a Consumer interface.
		stream = Stream.of("aaa2", "bbb2", "ddd2", "ccc2", "fff2");
		Consumer<String> consumer1 = (s) -> System.out.println(s);// The lambda expression returns a Consumer interface
		stream.forEach(consumer1);
		// A more direct approach
		// stream.forEach((s) -> System.out.println(s));
		System.out.println("********************");

		// (3) Use method reference, method reference is also a consumer.
		stream = Stream.of("aaa3", "bbb3", "ddd3", "ccc3", "fff3");
		Consumer consumer2 = System.out::println;
		stream.forEach(consumer2);
		// A more direct approach
		// stream.forEach(System.out::println);
		
		Consumer<String> conStr = (s) -> System.out.println(s);
		
		conStr.accept("Hello There...");
	}

}
