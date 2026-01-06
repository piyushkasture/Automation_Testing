package com.cdac;

import java.util.Iterator;
import java.util.Scanner;

public class Loop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int i =5;
//		System.out.println(i++);
//		System.out.println(++i);
////		System.out.println(++i + i++);
//		System.out.println(++i);
		
		
//		for(int i=0;i<10;i++) {
//			System.out.println(i);
//		}
		
		
		System.out.println("How many data to enter: ");
		int size=sc.nextInt();
		
		int marks[]= new int[size];
		
		for(int i=1; i<=size;i++) {
			System.out.println("Student data: "+i);
			marks[i]=sc.nextInt();
		}
		
		

	}
}
