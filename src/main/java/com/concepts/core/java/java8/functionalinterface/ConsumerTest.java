package com.concepts.core.java.java8.functionalinterface;

import java.util.function.Consumer;

class Employ {
	private int id;
	private String name;
	
	public Employ() {
		super();
	}
	public Employ(int id, String name) {
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
		Consumer<Employ> empNames = (e -> {
			e.setId(101);
			e.setName("Dasu Seedarla");
			
			System.out.println(e);
		});
		Employ e1 = new Employ();
		empNames.accept(e1);
		//System.out.println(e1);
		//System.out.println(e1.toString());
		
		Employ e2 = new Employ();
		Consumer<Employ> empNames2 = getEmpConsumer();
		empNames2.accept(e2);		
	}
	
	private static Consumer<Employ> getEmpConsumer() {
		Consumer<Employ> empNames = (e -> {
			e.setId(102);
			e.setName("Chinna Seedarla");
			System.out.println(e);
		});
		return empNames;
	}
}
