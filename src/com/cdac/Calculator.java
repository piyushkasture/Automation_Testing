package com.cdac;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op1;
		int op2;
		char operator;
		
		System.out.println("Enter value 1: ");
		op1 = sc.nextInt();
		
		System.out.println("Enter value 2: ");
		op2 = sc.nextInt();
		
		System.out.println("Enter operator: ");
		operator = sc.next().charAt(0);
		
//		By if condition
		
//		if (operator == '+') {
//			int result = op1+op2;
//			System.out.println(op1+" + "+op2+" = "+result);
//		}
//		else if (operator == '-') {
//			int result = op1-op2;
//			System.out.println(op1+" - "+op2+" = "+result);
//		}
//		else if (operator == '*') {
//			int result = op1*op2;
//			System.out.println(op1+" * "+op2+" = "+result);
//		}
//		else if (operator == '/') {
//			int result = op1/op2;
//			System.out.println(op1+" / "+op2+" = "+result);
//		}
//		else {
//			System.out.println("Invalid Operator...");
//		}
		
		
//		By switch case
		
		switch (operator) {
		case '+': {
			int result = op1+op2;
			System.out.println(op1+" + "+op2+" = "+result);
			break;
		}
		case '-': {
			int result = op1-op2;
			System.out.println(op1+" - "+op2+" = "+result);
			break;
		}
		case '*': {
			int result = op1*op2;
			System.out.println(op1+" * "+op2+" = "+result);
			break;
		}
		case '/': {
			int result = op1/op2;
			System.out.println(op1+" / "+op2+" = "+result);
			break;
		}
		default:
			System.out.println("Invalid operator..");
		}
		
	}

}
