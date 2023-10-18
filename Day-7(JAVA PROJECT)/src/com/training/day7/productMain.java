package com.training.day7;

public class productMain {
public static void main(String[] args) {
	
	product product1 = new product();
	product1.setEmpid(10);
	product1.setEmpname("Mike");
	product1.setSalary(10000);
	product product2 = new product();
	product2.setEmpid(10);
	product2.setEmpname("Mike");
	product2.setSalary(10000);
	if(product1.equals(product2)) {
		System.out.println("They are equals");
	}
	else {
		System.out.println("They are not equals");
	}

}
}
