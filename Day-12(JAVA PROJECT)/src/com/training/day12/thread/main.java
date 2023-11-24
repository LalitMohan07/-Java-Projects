package com.training.day12.thread;

import java.util.Scanner;

public class main {
	
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
	EvenThread even = new EvenThread();
	even.setName("EvenThread");
	even.start();
	try {
		even.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	EvenThread odd = new EvenThread();
	odd.setName("OddThread");
	odd.start();
	
	

}
	}
