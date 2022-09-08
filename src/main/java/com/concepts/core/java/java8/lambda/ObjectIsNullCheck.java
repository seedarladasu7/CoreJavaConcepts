package com.concepts.core.java.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class ObjectIsNullCheck {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("a", "b", null, "c", null);

		// As ready-made predicate
		long countNullsWithPredicate = list.stream().filter(Objects::isNull).count();
		System.out.println("As ready-made predicate: " + countNullsWithPredicate);

		// Lambda
		long countNullsWithLambda = list.stream().filter(object -> object == null).count();
		System.out.println("As Lambda: " + countNullsWithLambda);

		// Reimplement the Objects::isNull predicate
		long countNullsWithAnonymous = list.stream().filter(new Predicate<Object>() {
		    @Override
		    public boolean test(Object obj) {
		        return obj == null;
		    }
		}).count();
		System.out.println("Reimplement the Objects::isNull predicate: " + countNullsWithAnonymous);
	}

}
