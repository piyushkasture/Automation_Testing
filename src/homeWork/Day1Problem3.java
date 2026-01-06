package homeWork;

import java.util.Scanner;

public class Day1Problem3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
//		
//		System.out.println("Enter size: ");
//		size = sc.nextInt();

		int arr[] = { 1, 2, 1, 3, 4, 5, 6, 6, 7, 8, 9, 3, 5, 8, 6 };
//		int arr[] = new int[size];
		int distinct[] = new int[20];

		int k = 0;
		int result[] = new int[k];
		for (int i = 0; i < arr.length; i++) {
			boolean found = false;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == distinct[j]) {
					found = true;
					break;

				}
			}
			if (!found) {
				distinct[k++] = arr[i];
				

			}
			for (int p = 0; p < k; p++) {
				System.out.println(p);
			}

		}
	}
}
