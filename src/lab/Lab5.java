package lab;

import java.util.Scanner;

public class Lab5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		
		while(num>=0) {
		int result = num*(num-1);
		System.out.println(result);
		break;
	}
	
	}
}
