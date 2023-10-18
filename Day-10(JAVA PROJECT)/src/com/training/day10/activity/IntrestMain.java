package com.training.day10.activity;

public class IntrestMain {
	public void show() {
		BankAccount saving=(double amnt)->{
			return (amnt*7/100);
		};
		double savingacnt=saving.calculateIntrest(45000);
		System.out.println("The intrest of saving account is "+savingacnt);
		BankAccount current=(double amnt)->{
			return (amnt*5/100);
		};
		double currentacnt=current.calculateIntrest(50000);
		System.out.println("The intrest of current account is "+currentacnt);

	}
	public static void main(String[] args) {
		IntrestMain intm =new IntrestMain();
		intm.show();
	}
}
