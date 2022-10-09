package com.concepts.core.java.collections.list;

import java.util.*;

class Employee {

	private Integer empId;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	
	@Override
    public String toString() {
        return "Employee [id=" + empId + "]";
    }
}

class MyComparator implements Comparator<Employee> {
	 @Override
	    public int compare(Employee o1, Employee o2) {
	        return o1.getEmpId().compareTo(o2.getEmpId());
	    }
}

public class SortListOfEmployeeObjects {

	public static void main(String[] args) {
		ArrayList<Employee> empList = getUnsortedEmployeeList();
		
		//Collections.sort(empList, new MyComparator().reversed());
		Comparator<Employee> comp =  Comparator.comparing(e -> e.getEmpId());
		empList.sort(comp);
		System.out.println("empList: "+empList);
		
		empList.sort(comp.reversed());
		System.out.println("empList: "+empList);
		
		System.out.println("##############-----#############");
		Comparator<Employee> comp2 =  Comparator.comparing(Employee::getEmpId);
		empList.sort(comp2);
		System.out.println("empList: "+empList);
		
		empList.sort(comp2.reversed());
		System.out.println("empList: "+empList);
		
		MyComparator mComp = new MyComparator();
		empList.sort(mComp);
		System.out.println("empList: with custom Comp: "+empList);
		empList.sort(mComp.reversed());
		System.out.println("empList: with custom Comp: "+empList);
	}

	private static ArrayList<Employee> getUnsortedEmployeeList() {
		ArrayList<Employee> list = new ArrayList<>();
		Random rand = new Random(10);

		for (int i = 0; i < 5; i++) {
			Employee e = new Employee();
			e.setEmpId(rand.nextInt(100));
			list.add(e);
		}
		return list;
	}
}
