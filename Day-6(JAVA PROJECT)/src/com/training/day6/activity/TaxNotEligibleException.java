package com.training.day6.activity;

public class TaxNotEligibleException extends Exception {
	public String getMessage() {
		return"The emplopyee doesnt need to pay tax";
	}
}
