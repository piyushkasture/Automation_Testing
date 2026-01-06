package lab;

import java.util.Scanner;

public class Lab7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int atmPin = 2222;
		int pin;
		
// By do while loop
		
//        do {
//            System.out.println("Enter ATM PIN: ");
//            pin = sc.nextInt();
//
//            if (pin == atmPin) {
//                System.out.println("Access Granted");
//                break; 
//            } 
//        } while (true);

		
//		By while loop
		
		while (true) {
			System.out.println("Enter ATM PIN: ");
			pin = sc.nextInt();

			if (pin == atmPin) {
				System.out.println("Access Granted");
				break;

			}

		}
	}
}
