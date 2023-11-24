package com.training.day12.activity1;

public class Thread1 extends Thread
{
	private BankAccount bankac;
	public Thread1(BankAccount bankac) {
		this.bankac=bankac;
	}
	public void run() {
		bankac.withdraw(20000);
	}

}
