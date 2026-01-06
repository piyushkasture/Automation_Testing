package lab;

import java.util.Scanner;

//import homeLabDay3.BankAccount;

public class TestBankAccount {
	public static void main(String[] args) throws Exception {
//		
//
		BankAccount b1 = new BankAccount(122, "Piyush", 5000);
		BankAccount b2 = new BankAccount(150, "Tilak", 1000);

		try (Scanner sc = new Scanner(System.in)) {
			b1.displayAccountInfo();
			b2.displayAccountInfo();

			System.out.println("Enter deposit amount: ");
			double dep = sc.nextDouble();
			b1.deposit(dep);

			System.out.println("Enter withdraw amount: ");
			double withdr = sc.nextDouble();

			b1.withdraw(withdr);

			b1.displayAccountInfo();

			b2.deposit(withdr);

			b2.transferAmount(withdr);
			b2.displayAccountInfo();

//			b1.calculateEMI();

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
