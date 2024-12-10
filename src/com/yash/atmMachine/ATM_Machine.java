package com.yash.atmMachine;

import java.util.Scanner;

public class ATM_Machine {

	public static void main(String[] args) {
		BankAccount bnkac = new BankAccount(15000.0);

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\n--- ATM Menu ---");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Exit");
			System.out.print("Choose an option: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Your current balance is: " + bnkac.getBalance());
				break;
			case 2:
				System.out.print("Enter the amount to deposit: ");
				double depositAmount = sc.nextDouble();
				bnkac.depositeAmount(depositAmount);
				break;
			case 3:
				System.out.print("Enter the amount to withdraw: ");
				double withdrawAmount = sc.nextDouble();
				bnkac.withdrawAmount(withdrawAmount);
				break;
			case 4:
				System.out.println("Thank you for using the ATM.");
				sc.close();
				System.exit(0);
			default:
				System.out.println("Invalid option. Please try again.");
			}
		}
	}
}
