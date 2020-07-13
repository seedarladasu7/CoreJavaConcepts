package com.concepts.core.java.collections.set;

import java.util.*;

class Book implements Comparable<Book> {
	int id;
	String name, author, publisher;
	int quantity;

	public Book(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}

	@Override
	public int compareTo(Book b) {
		if (this.id > b.id) {
			return 1;
		} else if (this.id < b.id) {
			return -1;
		} else {
			return 0;
		}
	}
}

class BookStore {
	int id;
	String name, storeType, location;
	int capacity;
	
	public BookStore(int id, String name, String storeType, String location, int capacity) {
		super();
		this.id = id;
		this.name = name;
		this.storeType = storeType;
		this.location = location;
		this.capacity = capacity;
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

	public String getStoreType() {
		return storeType;
	}

	public void setStoreType(String storeType) {
		this.storeType = storeType;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public String toString() {
		return "Id: " + this.id + "-- Name: " + this.name + "-- StoreType: " + this.storeType+ "-- Location: " + this.location + "-- Capacity: " + this.capacity;
	}
}

public class TreeSetWithComparableExample {
	
	public static void main(String[] args) {
		Set<Book> set = new TreeSet<Book>();
		// Creating Books
		Book b1 = new Book(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b2 = new Book(233, "Operating System", "Galvin", "Wiley", 6);
		Book b3 = new Book(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		// Adding Books to TreeSet
		set.add(b1);
		set.add(b2);
		set.add(b3);
		// Traversing TreeSet
		for (Book b : set) {
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}
	}
}