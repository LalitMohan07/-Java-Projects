package com.training.day12.activity1;

public class Thread2 extends Thread{
	private BankAccount bankac;
	public Thread2(BankAccount bankac) {
		this.bankac=bankac;
	}
	public void run() {

		bankac.withdraw(30000);
	}

}
