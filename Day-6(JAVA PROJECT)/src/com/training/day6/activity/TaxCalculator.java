package com.training.day6.activity;

import java.util.Scanner;

public class TaxCalculator {
	Scanner sc;
	TaxCalculator(){
		sc= new Scanner(System.in);
	}
	public void calculateTax()throws CountryNotValidException,EmployeeNameInvalidException,TaxNotEligibleException {
		String empname;
		boolean isIndian;
		double empSal;
		double taxAmount;
		System.out.println("Enter Your name ");
		empname=sc.nextLine();
		sc.nextLine();
		System.out.println("Is the employee Indian ");
		isIndian=sc.nextBoolean();
		System.out.println("Enter Your salary ");
		empSal=sc.nextDouble();
		if(!isIndian) {
			throw new CountryNotValidException();
		}
		
		else if((empname.equals(null)) || (empname.equals(""))) {
			throw new EmployeeNameInvalidException();
		}
		
		

		
		if(empSal>=100000 && isIndian) {
			taxAmount = empSal*8/100;
			System.out.println("The total Tax calculated is "+taxAmount); 

		}
		else if((empSal>=50000 && empSal<100000)&& isIndian ) {
			taxAmount = empSal*6/100;
			System.out.println("The total Tax calculated is "+taxAmount); 

		}
		else if((empSal>=30000 && empSal<50000)&& isIndian ) {
			taxAmount = empSal*5/100;
			System.out.println("The total Tax calculated is "+taxAmount); 

		}
		else if((empSal>=10000 && empSal<30000)&& isIndian ) {
			taxAmount = empSal*4/100;
			System.out.println("The total Tax calculated is "+taxAmount); 
		}
		else {
			throw new TaxNotEligibleException();
		}
	}
}
