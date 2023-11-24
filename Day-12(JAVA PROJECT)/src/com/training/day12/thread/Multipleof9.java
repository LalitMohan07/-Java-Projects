package com.training.day12.thread;

import java.util.Scanner;
public class Multipleof9 extends Thread{
	Scanner sc= new Scanner(System.in);
	public void run() {
		System.out.println("Enter the no u want to check multiples upto 10");
		int i= sc.nextInt();
		for(int x=1;x<=10;x++) {
			System.out.println(i+"*"+x+"="+x*i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

