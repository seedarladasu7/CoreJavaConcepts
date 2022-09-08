package com.concepts.core.java.tech.example;

public class VariableScopeChecks {
	private double commission = 5.5d;

	public double increaseCommission(final double newComm) {
		double commission = newComm;
		commission += commission;
		return commission;
	}

	public double getCommission() {
		return commission;
	}

	public static void main(String[] args) {
		VariableScopeChecks m = new VariableScopeChecks();
		System.out.println(m.increaseCommission(3.3));
		System.out.println(m.getCommission());
	}
}