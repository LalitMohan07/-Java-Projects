package com.training.day12.activity1;

public class BankAccount {
	static int balance=50000;
	public synchronized void withdraw(int amount) {
		balance= balance-amount;
		System.out.println("After withdrawal the reamining balance is "+balance);
	}
}
