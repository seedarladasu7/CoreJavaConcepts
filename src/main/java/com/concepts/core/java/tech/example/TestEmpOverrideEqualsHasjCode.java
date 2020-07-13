package com.concepts.core.java.tech.example;

import java.util.HashMap;
import java.util.Map;

class Employee {

    private int empId;
    private String empName;

    public Employee(int empId, String empName) {
        super();
        this.empId = empId;
        this.empName = empName;
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

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName + "]";
    }

    @Override
    public int hashCode() {
        return empId + empName.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
    	if (this == obj) {
            return true;
        }
        if (!(this instanceof Employee)) {
            return false;
        }
        Employee emp = (Employee) obj;
        return this.getEmpId() == emp.getEmpId() && this.getEmpName().equals(emp.getEmpName());
    }

}

public class TestEmpOverrideEqualsHasjCode {
	public static Map<Employee, String> empMap = new HashMap<>();
	public static void main(String[] args) {
        Employee emp1 = new Employee(101,"Mahesh");
        Employee emp2 = new Employee(101,"Mahesh");
        Employee emp3 = new Employee(103,"Ranjan");
		/*
		 * System.out.println(emp1.hashCode()); System.out.println(emp2.hashCode());
		 * System.out.println(emp1.equals(emp2)); System.out.println(emp1.equals(emp3));
		 */
        
        empMap.put(emp1, "101 1st Entry");
        empMap.put(emp2, "101 2nd Entry");
        empMap.put(emp3, "103 1st Entry");
        
        System.out.println(empMap);
        System.out.println(empMap.size());
        
        
    }
}
