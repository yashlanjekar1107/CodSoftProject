package com.yash.atmMachine;

public class BankAccount {
	private double balance;

	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void depositeAmount(double amount) {
		if (amount > 0) {
			balance = balance + amount;
			System.out.println("Amount " + amount + " deposited successfully!");
		} else {
			System.out.println("Please enter amount grater than 0.");
		}
	}

	public void withdrawAmount(double amount) {
		if (amount <= balance && amount > 0) {
			balance = balance - amount;
			System.out.println("Amount " + amount + " withdrawn successfully!");
		} else if (amount > balance) {
			System.out.println("Balance in account is insufficient.");
		} else {
			System.out.println("Please enter valid amount.");
		}
	}
}
