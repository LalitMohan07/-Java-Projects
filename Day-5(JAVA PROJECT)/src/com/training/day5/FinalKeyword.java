package com.training.day5;

public final class FinalKeyword {
	public final int CONSTANT =100;
	public final void method() {
		System.out.println("A final method cannot be overriden");
	}
	public static void main(String[] args) {
		FinalKeyword f=  new FinalKeyword();
		System.out.println("A final variable cannot be chnaged");
		f.method();
		System.out.println("A final class cannot be extended");

		
	}
}
