package com.concepts.core.java.java8.functionalinterface;

@FunctionalInterface
interface MyFunctionalInterface {
	public abstract void execute();
	
	@Override
	String toString();
	
	default void defaultTask1() {
		System.out.println("defaultTask1()...");
	}
	
	default void defaultTask2() {
		System.out.println("defaultTask2()...");
	}
	
	static void staticTask1() {
		System.out.println("staticTask1()...");
	}
	
	static void staticTask2() {
		System.out.println("staticTask2()...");
	}
}

class MyFunctionalInterfaceImpl implements MyFunctionalInterface{
	
	public void execute() {
		System.out.println("execute() of MyFunctionalInterface...");
	}
	
	public String toString() {
		return "toString() of MyFunctionalInterface...";
	}
}

public class MyFunctionalInterfaceTest {
	public static void main(String[] args) {
		MyFunctionalInterface intf = new MyFunctionalInterfaceImpl();
		intf.execute();
		intf.defaultTask1();
		intf.defaultTask2();
		MyFunctionalInterface.staticTask1();
		MyFunctionalInterface.staticTask2();
		System.out.println(intf.toString());
	}
}
