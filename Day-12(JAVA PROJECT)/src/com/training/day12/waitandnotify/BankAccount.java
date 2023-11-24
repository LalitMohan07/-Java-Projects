package com.training.day12.waitandnotify;

public class BankAccount {
double balance=70000;
	public synchronized void withdraw(double amount) {
		if(balance>amount) {
			System.out.println("Insufficient Balance");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
		System.out.println("come here");
		this.balance-=amount;
		System.out.println("The Remaining balnace after withdrawal is "+this.balance);
	}
	public synchronized void deposit(double amount) {
		this.balance +=amount;
		System.out.println("The Total balance after Deposit is "+this.balance);
		notify();
	}
}
