package com.concepts.core.java.tech.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class PrintEmployeeList {
	public static void main(String[] args) {
		List<Employee> employees1 = new ArrayList<>();
		employees1.add(new Employee(1, "Leela"));
		employees1.add(new Employee(2, " emp2"));
		employees1.add(new Employee(3, "Emp3"));

		List<Employee> employees2 = new ArrayList<>();
		employees2.add(new Employee(4, "ep4"));
		employees2.add(new Employee(5, "emp5"));

		List<List<Employee>> empsList = new ArrayList<>();
		empsList.add(employees1);
		empsList.add(employees2);

		List<Employee> empObjs = empsList.stream().flatMap(Collection::stream).collect(Collectors.toList());
		System.out.println("empObjs: " + empObjs);

		List<String> empNames = empObjs.stream().map(temp -> temp.getEmpName()).collect(Collectors.toList());
		System.out.println("empNames: " + empNames);

	}
}