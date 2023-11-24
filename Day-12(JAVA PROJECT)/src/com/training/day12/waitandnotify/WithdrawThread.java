package com.training.day12.waitandnotify;

public class WithdrawThread  extends Thread{
	public BankAccount bobj;
	public WithdrawThread(BankAccount bobj) {
		this.bobj=bobj; 
	}
	public void run() {
		bobj.withdraw(70000);
	}
}
