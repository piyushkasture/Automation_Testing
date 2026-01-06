package com.cdac.student;

import java.util.Scanner;

public class Student extends Person {
	int rollNo;
	int marks;

	public Student(String name, int age, String city, int rollNo, int marks) {
		super(name, age, city);
		this.rollNo = rollNo;
		this.marks = marks;
	}

	public Student(String name, int rollNo, int marks) {
		super(name);
		this.rollNo = rollNo;
		this.marks = marks;
	}
	 public void display() {
		System.out.println(name+" "+rollNo+" "+marks);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		Student s1 = new Student("hghg", 22, "pune", 12, 90);
//		Student s2 = new Student("piyush", 10, 80);
//		s1.display();
//		System.out.println();
		
		Student s[] = new Student[5];
	
	for (int i = 0; i < s.length; i++) {
		System.out.println("Enter name: ");
		String name = sc.next();
		System.out.println("Enter RollNo: ");
		int rollNo = sc.nextInt();
		System.out.println("Enter marks: ");
		int marks = sc.nextInt();
		
		s[i] = new Student(name, rollNo, marks);
	}
	
	for(Student i: s) {
		i.display();
	}
	
	}
	
	

}
