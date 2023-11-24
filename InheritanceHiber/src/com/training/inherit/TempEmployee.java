package com.training.inherit;

public class TempEmployee extends Employee{
	private double contAmount;
	public double getContAmount() {
		return contAmount;
	}
	public void setContAmount(double contAmount) {
		this.contAmount = contAmount;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	private int duration;
	
}
