package com.concepts.core.java.designpatterns.singleton;

public class EagerSingleton {

	private EagerSingleton() {

	}

	private static final EagerSingleton instance = new EagerSingleton();

	public static synchronized EagerSingleton getInstance() {
		return instance;
	}

}
