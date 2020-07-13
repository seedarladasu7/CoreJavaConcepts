package com.concepts.core.java.java8.lambda;

import java.util.function.BiConsumer;

public class AccessingOutScopeVars {
	private int x = 100;

	public static void main(String[] args) {
		AccessingOutScopeVars obj = new AccessingOutScopeVars();
		obj.example();
	}

	public void example() {
		BiConsumer<String, String> funcIntrfc = (str1, str2) -> {
			System.out.println(str1 + ", X1: " + x);
			int x = 500;
			System.out.println(str2 + ", X1: " + x);
		};
		funcIntrfc.accept("Dasu", "Seedarla");
	}
}
