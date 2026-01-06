package com.cdac.employee;
import java.util.Scanner;

public class Manager extends Employee {
	double incentives;
	int teamSize;

	public Manager(int empNo, String name, String dept, double salary, double incentives, int teamSize) {
		super(empNo, name, dept, salary);
		this.incentives = incentives;
		this.teamSize = teamSize;
	}
	
	public double salary() {
//		System.out.println("Salary of manager: "+(salary+incentives));
		return salary+incentives;
	}
	
	public void displaDetails() {
		System.out.println("Name: "+name+" "+" Salary: "+salary());
		
	}
	public void assignTask() {
		System.out.println("Assign Task to Manager");
	}
	

}
