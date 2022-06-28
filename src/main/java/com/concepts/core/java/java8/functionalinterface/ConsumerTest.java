package com.concepts.core.java.java8.functionalinterface;

import java.util.function.Consumer;

class Employee {
	private int id;
	private String name;
	
	public Employee() {
		super();
	}
	public Employee(int id, String name) {
		super();
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employ [id=" + id + ", name=" + name + "]";
	}
}

public class ConsumerTest {
	public static void main(String[] args) {
		Consumer<Employee> empNames = (e -> {
			e.setId(101);
			e.setName("Dasu Seedarla");			
			System.out.println(e);
		});
		Employee e1 = new Employee();
		empNames.accept(e1);
		//System.out.println(e1);
		//System.out.println(e1.toString());
		
		Employee e2 = new Employee();
		Consumer<Employee> empNames2 = getEmpConsumer();
		empNames2.accept(e2);		
	}
	
	private static Consumer<Employee> getEmpConsumer() {
		Consumer<Employee> empNames = (e -> {
			e.setId(102);
			e.setName("Chinna Seedarla");
			System.out.println(e);
		});
		return empNames;
	}
}
