package com.training.day12.waitandnotify;


public class BankMain {
	public static void main(String[] args) {
		BankAccount bank = new BankAccount();
		WithdrawThread t2= new WithdrawThread(bank);
		t2.start();
		DepositThread t1= new DepositThread(bank);
		t1.start();
	}
}
