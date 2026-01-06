package lab;

import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int age;
		int weight;
		
		System.out.println("Enter age: ");
		age = sc.nextInt();
		
		System.out.println("Enter weight: ");
		weight = sc.nextInt();
		
		if (age>=18 && age<=65) {
			if (weight>=50) {
				System.out.println("You are eligible to donate blood");
			}
		}
		else {
			System.out.println("You are not eligible to donate blood");
		}
		
	}
}
