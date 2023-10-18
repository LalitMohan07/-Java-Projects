package com.training.day6;

public class ArrayStore {
	public void display() {
		try {
			
			Number[] nm = new Double[5];
			nm[0]=7;
		}
		catch(ArrayStoreException e) {
			System.out.println("U R Trying to store object of differnt type");
		}
	}
 public static void main(String[] args) {
	ArrayStore ar = new ArrayStore();
	ar.display();
} 
}
