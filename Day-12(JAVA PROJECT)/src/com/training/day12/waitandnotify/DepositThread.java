package com.training.day12.waitandnotify;

public class DepositThread extends Thread {
	public BankAccount bobj;
	public DepositThread(BankAccount bobj) {
		this.bobj=bobj; 
	}
	public void run() {
		bobj.deposit(40000);
	}
}
