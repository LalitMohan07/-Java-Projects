package com.training.day5.assignment3;

public class StudentB extends Marks{
	protected double subject4;
	@Override
	public void accept() {
		super.accept();
		System.out.println("Enter the Marks for Subject 4");
		subject4= sc.nextDouble();
		}
	@Override
	public double getPercentage() {
		return (subject1+subject2+subject3+subject4)/400*100;
	}
}
