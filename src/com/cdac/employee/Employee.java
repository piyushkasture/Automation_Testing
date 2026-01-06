package com.cdac.employee;

public class Employee {
	int empNo;
	String name;
	String dept;
	double salary;
	
	public Employee(int empNo, String name, String dept, double salary) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
	public double salary() {
//		System.out.println("Salary of employee: "+salary);
		return salary;
	}
	public void displaDetails() {
		System.out.println("Name: "+name+" "+" Salary: "+salary());
		
	}

}
