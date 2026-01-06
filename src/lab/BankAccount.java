package lab;

import java.util.Scanner;

public class BankAccount {
	

	int accNo;
	String name;
	double balance;

	public BankAccount(int accNo, String name, double balance) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}

	public void deposit(double dep) throws Exception {

		if (dep >= 0) {
			balance += dep;
			System.out.println("You enter deposit amonut: " + dep);
			System.out.println("Total balance: "+balance);

		} else {
			throw new NegativeAmount();
		}

	}

	public void withdraw(double withdr) throws Exception {

		if (withdr < balance) {
			balance -= withdr;
			System.out.println("You withdraw: " + withdr);
			System.out.println("Total balance: " + balance);
		} else {
			throw new InsufficentBalanceCE();
		}

	}
	
	public void transferAmount(double withdr) throws Exception {
		if (withdr <= balance) {
			balance += withdr;
			System.out.println("You withdraw: " + withdr);
			System.out.println("Total balance: " + balance);
		} else {
			throw new InsufficentBalanceCE();
		}
	}
	
	public void displayAccountInfo() {
		System.out.println("Name: "+name+" Account No: "+accNo+" Balance: "+balance);
	}

}
