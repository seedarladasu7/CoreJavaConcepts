package com.concepts.core.java.designpatterns.singleton;

import java.io.Serializable;

public class LazySingleton extends MyClone implements Serializable {

	private static final long serialVersionUID = 1298362914576242945L;
	private static LazySingleton instance;

	private LazySingleton() {
		if (instance != null) {
			throw new IllegalStateException("Object can't be created from Reflection API");
		}
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// throw new CloneNotSupportedException();
		return super.clone();
	}
	
	protected Object readresolve() {
		return instance;
	}

	public static synchronized LazySingleton getInstance() {

		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;

	}

}
