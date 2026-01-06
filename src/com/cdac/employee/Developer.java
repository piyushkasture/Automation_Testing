package com.cdac.employee;

public class Developer extends Employee {
	String skills;
	int experience;
	
	
	public Developer(int empNo, String name, String dept, double salary, String skills, int experience) {
		super(empNo, name, dept, salary);
		this.skills = skills;
		this.experience = experience;
	}
	public void resolveBugs() {
		System.out.println("Resolve bug by Developer");
	}

}
