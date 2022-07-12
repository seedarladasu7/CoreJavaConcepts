package com.concepts.core.java.java8.streams;

import java.util.ArrayList;
import java.util.List;

class Employee {
	private int empId;
	private String empName;
	private int empSalary;

	public Employee(int empId, String empName, int empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
}

public class ParallelStreamDemo {

	public static void main(String[] args) {

		long t1, t2;
		List<Employee> eList = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			eList.add(new Employee(1, "A", 20000));
			eList.add(new Employee(2, "B", 3000));
			eList.add(new Employee(3, "C", 15002));
			eList.add(new Employee(4, "D", 7856));
			eList.add(new Employee(5, "E", 200));
			eList.add(new Employee(6, "F", 50000));
		}

		/***** Here We Are Creating A 'Sequential Stream' & Displaying The Result *****/
		t1 = System.currentTimeMillis();
		System.out.println("Sequential Stream Count?= " + eList.stream().filter(e -> e.getEmpSalary() > 15000).count());

		t2 = System.currentTimeMillis();
		System.out.println("Sequential Stream Time Taken?= " + (t2 - t1) + "\n");

		/***** Here We Are Creating A 'Parallel Stream' & Displaying The Result *****/
		t1 = System.currentTimeMillis();
		System.out.println(
				"Parallel Stream Count?= " + eList.parallelStream().filter(e -> e.getEmpSalary() > 15000).count());

		t2 = System.currentTimeMillis();
		System.out.println("Parallel Stream Time Taken?= " + (t2 - t1));
	}
}
