package com.training.day12.activity1;

public class AppMain {
public static void main(String[] args) {
	BankAccount bac = new BankAccount();
	Thread1 t1= new Thread1(bac);
	Thread2 t2= new Thread2(bac);
	t1.start();
	t2.start();

}
}
