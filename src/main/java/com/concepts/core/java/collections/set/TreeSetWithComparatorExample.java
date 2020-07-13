package com.concepts.core.java.collections.set;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

// NavigableSet adds Navigation methods like descendingIterator() and descendingSet(), 
// ceiling(), floor(), higher(), lower(), headSet(), tailSet(), subSet(), pollFirst() and pollLast().

public class TreeSetWithComparatorExample {
	
	public static void main(String a[]) {
		
		Comparator<Empl> myIdComp = (e1, e2) -> {
			if (e1.getId() > e2.getId()) {
				return 1;
			} else if (e1.getId() < e2.getId()) {
				return -1;
			} else {
				return 0;
			}
		};
		
		// By using id comparator with lambda (int comparison)
		NavigableSet<Empl> idCompWithLambda = new TreeSet<Empl>(myIdComp);
		idCompWithLambda.add(new Empl(3, "Ram", 3000));
		idCompWithLambda.add(new Empl(1, "John", 6000));
		idCompWithLambda.add(new Empl(4, "Crish", 2000));
		idCompWithLambda.add(new Empl(2, "Tom", 2400));
		for (Empl e : idCompWithLambda) {
			System.out.println(e);
		}
		System.out.println("===========================");
		
		// By using id comparator with java8 commparator (int comparison)
		NavigableSet<Empl> idCompWithMRef = new TreeSet<Empl>();
		idCompWithMRef.add(new Empl(3, "Ram", 3000));
		idCompWithMRef.add(new Empl(1, "John", 6000));
		idCompWithMRef.add(new Empl(4, "Crish", 2000));
		idCompWithMRef.add(new Empl(2, "Tom", 2400));
		
		Comparator java8Comp = idCompWithMRef.comparator();
		
		for (Empl e : idCompWithMRef) {
			System.out.println(e);
		}
		System.out.println("===========================");
		
		// By using id comparator (int comparison)
		NavigableSet<Empl> idComp = new TreeSet<Empl>(new MyIdComp());
		idComp.add(new Empl(3, "Ram", 3000));
		idComp.add(new Empl(1, "John", 6000));
		idComp.add(new Empl(4, "Crish", 2000));
		idComp.add(new Empl(2, "Tom", 2400));
		for (Empl e : idComp) {
			System.out.println(e);
		}
		System.out.println("===========================");
		// By using name comparator (String comparison)
		SortedSet<Empl> nameComp = new TreeSet<Empl>(new MyNameComp());
		nameComp.add(new Empl(3, "Ram", 3000));
		nameComp.add(new Empl(1, "John", 6000));
		nameComp.add(new Empl(4, "Crish", 2000));
		nameComp.add(new Empl(2, "Tom", 2400));
		for (Empl e : nameComp) {
			System.out.println(e);
		}
		System.out.println("===========================");
		// By using salary comparator (int comparison)
		TreeSet<Empl> salComp = new TreeSet<Empl>(new MySalaryComp());
		salComp.add(new Empl(3, "Ram", 3000));
		salComp.add(new Empl(1, "John", 6000));
		salComp.add(new Empl(4, "Crish", 2000));
		salComp.add(new Empl(2, "Tom", 2400));
		for (Empl e : salComp) {
			System.out.println(e);
		}
	}
}

class MyIdComp implements Comparator<Empl> {

	@Override
	public int compare(Empl e1, Empl e2) {
		if (e1.getId() > e2.getId()) {
			return 1;
		} else if (e1.getId() < e2.getId()) {
			return -1;
		} else {
			return 0;
		}
	}
}

class MyNameComp implements Comparator<Empl> {

	@Override
	public int compare(Empl e1, Empl e2) {
		return e1.getName().compareTo(e2.getName());
	}
}

class MySalaryComp implements Comparator<Empl> {

	@Override
	public int compare(Empl e1, Empl e2) {
		if (e1.getSalary() > e2.getSalary()) {
			return 1;
		} else if (e1.getSalary() < e2.getSalary()) {
			return -1;
		} else {
			return 0;
		}
	}
}

class Empl {
	private int id;
	private String name;
	private int salary;

	public Empl(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String toString() {
		return "Id: " + this.id + "-- Name: " + this.name + "-- Salary: " + this.salary;
	}
}
