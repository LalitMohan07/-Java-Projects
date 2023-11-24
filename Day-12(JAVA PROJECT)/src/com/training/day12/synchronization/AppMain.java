package com.training.day12.synchronization;


public class AppMain {
	public static void main(String[] args) {
		PrintTable pt1 = new PrintTable();
		Thread1 t1= new Thread1(pt1);
		t1.start();
		Thread2 t2= new Thread2(pt1);
		t2.start();
		
	}
}
