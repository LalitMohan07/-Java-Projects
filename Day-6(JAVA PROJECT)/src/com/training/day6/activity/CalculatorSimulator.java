package com.training.day6.activity;

public class CalculatorSimulator extends TaxCalculator{
public static void main(String[] args) throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
	CalculatorSimulator cal = new CalculatorSimulator();
	try {
		cal.calculateTax();


	}
	catch(CountryNotValidException e) {
		System.out.println(e.getMessage());
	}
	catch(EmployeeNameInvalidException e) {
		System.out.println(e.getMessage());
	}
	catch(TaxNotEligibleException e) {
		System.out.println(e.getMessage());
	}
}
}

