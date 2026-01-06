package lab;

import java.util.Scanner;

public class ArrayLab1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter number: ");
//		int row = sc.nextInt();
		
		
//		System.out.println("Enter col number: ");
//		int col = sc.nextInt();

		int marks[][] = new int[5][6];

		int a=1;
		
		for (int i = 0; i<5; i++) {
			for (int j = 0; j <5; j++) {
				if (i==j) {
					System.out.print(a);
					
				}
				else {
					System.out.print(" ");
				}
				

			}
			System.out.println();
			a++;
		}
		
	}
}
