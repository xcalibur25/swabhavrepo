package com.techlabs.account.test;

import com.techlabs.account.Account;

public class TestAccount {

	public static void main(String[] args) {

		Account account = new Account(1234, "Yash", 1000.0);

		account.deposit(1000.0);

		System.out.println(Account.getTransactionCount());

		account.withdraw(600.0);

		System.out.println(Account.getTransactionCount());
		// displayDetails(account);
		// System.out.println("\n");

		Account account1 = new Account(5678, "Raj", 5000.0);

		account1.deposit(1000.0);

		System.out.println(Account.getTransactionCount());

		account1.withdraw(600.0);

		System.out.println(Account.getTransactionCount());

		// displayDetails(account1);
		// System.out.println("\n");
		// System.out.println(Account.getTransactionCount());

		Account[] acc = new Account[3];
		acc[0] = new Account(1111, "Raj", 5000);
		acc[1] = new Account(1222, "Sahil", 6000);
		acc[2] = new Account(1333, "Pujan", 40000);
		Account m = account.checkRichestAccountHolder(acc);
		System.out.println("The richest account holder is " + m.getName());

		// System.out.println("The total number of transactions are " + count);
	}

	public static void displayDetails(Account a) {
		System.out.println("The name of account holder is " + a.getName());
		System.out.println("The account number is " + a.getAccountNo());
		System.out.println("The balance is " + a.getBalance());
	}

}
