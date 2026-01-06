package lab;

import java.util.Scanner;

public class ArrayLab3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int factory[][] = new int[4][5];

		for (int i = 0; i < 4; i++) {
			System.out.println("Batch " + (i + 1));
			for (int j = 0; j < 5; j++) {
				System.out.println("Enter inspection value " + (j + 1) + " :");
				int inspe = sc.nextInt();
				factory[i][j] = inspe;
			}

		}

		int pass = 1;
		int countPass = 0;

		countFullyPassedBatches(factory, pass, countPass);

	}

	private static void countFullyPassedBatches(int[][] factory, int pass, int countPass) {
		for (int i = 0; i < 4; i++) {
			int count = 0;

			for (int j = 0; j < 5; j++) {
				if (factory[i][j] == pass) {
					count++;
				}
			}

			if (count == 5) {
				countPass++;
			}
		}

		System.out.println("Pass: " + countPass);
	}

}
