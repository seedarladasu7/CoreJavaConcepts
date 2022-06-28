package com.concepts.core.java.inheritance;

interface IOne {
	void method();
}

interface ITwo {
	void method();
}

class MiltiLevelInheritance implements IOne, ITwo {

	// Anonymous inner class that implements only IOne
	private final IOne one = new IOne() {
		@Override
		public void method() {
			System.out.println("IOne");
		} 
	};

	// Anonymous inner class that implements only ITwo
	private final ITwo two = new ITwo() {
		@Override
		public void method() {
			System.out.println("ITwo");
		}
	};

	@Override
	public void method() {
		System.out.println("MiltiLevelInheritance");
	}

	// Method that delegates to IOne
	public void methodIOne() {
		this.one.method();
	}

	// Method that delegates to ITwo
	public void methodITwo() {
		this.two.method();
	}
}

public class MiltiLevelInheritanceTest {
	public static void main(String[] args) {
		MiltiLevelInheritance a = new MiltiLevelInheritance();
		a.method(); // MiltiLevelInheritance
		a.methodIOne(); // IOne
		a.methodITwo(); // ITwo
		
	}
}
