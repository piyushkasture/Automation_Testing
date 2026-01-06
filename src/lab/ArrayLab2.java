package lab;

import java.util.Scanner;

public class ArrayLab2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] matrix = new int[3][3];
		int a = 1;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrix[i][j] = a;
				System.out.print(matrix[i][j] + " ");
				a++;
			}
			System.out.println();
		}

		System.out.print("Enter target value: ");
		int target = sc.nextInt();

		findTarget(matrix, target);

	}

	private static void findTarget(int[][] matrix, int target) {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (matrix[i][j] == target) {
					System.out.println((i+1) +" "+ (j+1));
					return ;
				}
			}
		}
		System.out.println("Not found");
	}
	// TODO Auto-generated method stub

}
