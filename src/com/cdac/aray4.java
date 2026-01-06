package com.cdac;
import java.util.Scanner;

import java.util.Scanner;

public class aray4 {

    public void findTarget(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    System.out.println("Found at (" + i + "," + j + ")");
                    return; 
                }
            }
        }
        System.out.println("Not found");
    }

    public void main(String[] args) {
        int[][] matrix = new int[3][3];
        int a = 1;

        // Fill and print matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = a;
                System.out.print(matrix[i][j] + " ");
                a++;
            }
            System.out.println();
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        // Call function
        findTarget(matrix, target);
    }
}