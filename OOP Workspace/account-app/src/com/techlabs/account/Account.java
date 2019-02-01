package com.techlabs.account;

public class Account {

	private int accountNo;
	private String name;
	private double balance;
	public static int count;

	public Account(int accountNo, String name, double balance) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}

	static {
		count = 0;
	}

	public Account(int accountNo, String name) {
		this(accountNo, name, 500);
	}

	public int getAccountNo() {
		return accountNo;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		this.balance = this.balance + amount;
		count++;

	}

	public void withdraw(double amount) {
		double minBalance = 500;
		double newAmount = amount;
		checkBalance(minBalance, newAmount);
		count++;

	}

	private double checkBalance(double minBalance, double newAmount) {
		if (this.balance - newAmount > minBalance) {
			this.balance = this.balance - newAmount;
			return this.balance;

		}
		System.out.println("The amount cannot be withdrawn as " + "amount is greater than minimum balance");
		return this.balance;

	}

	public Account checkRichestAccountHolder(Account[] acc) {
		Account max = acc[0];
		for (int i = 0; i < 3; i++) {
			if (acc[i].getBalance() > max.getBalance()) {
				max = acc[i];
			}
		}
		return max;
	}

	public static int getTransactionCount() {
		return count;
	}

}
