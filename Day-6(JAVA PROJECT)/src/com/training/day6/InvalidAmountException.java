package com.training.day6;

public class InvalidAmountException extends Exception {
	public String getMessage1() {
		return"U r trying to withdraw amount more than balance";
	}
}
