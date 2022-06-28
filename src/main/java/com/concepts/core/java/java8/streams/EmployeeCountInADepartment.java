package com.concepts.core.java.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class EmployeeCountInADepartment {
	public static void main(String[] args) {// from ww w . j a va2 s . com
		Employee1[] employees = { new Employee1("J", "Red", 51000, "IT"), new Employee1("A", "Green", 71600, "IT"),
				new Employee1("M", "Black", 35187.5, "Sales"), new Employee1("K", "Yellow", 47100.77, "Marketing"),
				new Employee1("L", "Pink", 62001, "IT"), new Employee1("D", "Blue", 32001, "Sales"),
				new Employee1("W", "Brown", 42361.4, "Marketing") };

		// get List view of the Employees
		List<Employee1> list = Arrays.asList(employees);

		// display all Employees
		System.out.println("Complete Employee list:");
		list.stream().forEach(System.out::println);

		// count number of Employees in each department
		System.out.printf("%nCount of Employees by department:%n");
		Map<String, Long> employeeCountByDepartment = list.stream()
				.collect(Collectors.groupingBy(Employee1::getDepartment, TreeMap::new, Collectors.counting()));
		
		employeeCountByDepartment
				.forEach((department, count) -> System.out.println(department +" has "+count+" employee(s)"));

	}
}

class Employee1 {
	private String firstName;
	private String lastName;
	private double salary;
	private String department;

	// constructor
	public Employee1(String firstName, String lastName, double salary, String department) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.department = department;
	}

	// set firstName
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	// get firstName
	public String getFirstName() {
		return firstName;
	}

	// set lastName
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// get lastName
	public String getLastName() {
		return lastName;
	}

	// set salary
	public void setSalary(double salary) {
		this.salary = salary;
	}

	// get salary
	public double getSalary() {
		return salary;
	}

	// set department
	public void setDepartment(String department) {
		this.department = department;
	}

	// get department
	public String getDepartment() {
		return department;
	}

	// return Employee's first and last name combined
	public String getName() {
		return String.format("%s %s", getFirstName(), getLastName());
	}

	// return a String containing the Employee's information
	@Override
	public String toString() {
		return String.format("%-8s %-8s %8.2f   %s", getFirstName(), getLastName(), getSalary(), getDepartment());
	}
}
