package com.cdac;

import java.util.Iterator;
import java.util.Scanner;

public class Arr_2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int r, c = 5;
		
		System.out.println("Enter number of studemts :");
		r = 2;

		int marks[][] = new int[r][c];

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.println("Enter marks " + j + " :");
				marks[i][j] = sc.nextInt();

			}

		}

//		for (int i = 0 ; i<r; i ++);
		for (int i = 0; i < r; i++) {
			int sum = 0;
			for (int j = 0; j < c; j++) {
				sum += marks[i][j];
			}
			System.out.println("Total marks: " + sum);
			System.out.println("Percentage: " + sum / 5);

		}
	}

}
