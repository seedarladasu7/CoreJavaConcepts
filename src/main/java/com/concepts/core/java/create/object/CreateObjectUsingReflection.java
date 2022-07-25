package com.concepts.core.java.create.object;

import java.lang.reflect.InvocationTargetException;

public class CreateObjectUsingReflection {

	int value;
	public CreateObjectUsingReflection(int val) {
		this.value = val;
	}
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		CreateObjectUsingReflection obj = CreateObjectUsingReflection.class.getConstructor(int.class).newInstance(100);
		obj.showString();
	}

	private void showString() {
		System.out.println("Hello this is showString method: " + this.value);
	}
}
