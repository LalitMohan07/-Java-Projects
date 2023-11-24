package com.training.day12.thread;
import java.util.*;
public class Multiple extends Thread{
	Scanner sc= new Scanner(System.in);
	public void run() {
		System.out.println("Enter the no u want to check multiples upto 5");
		int i= sc.nextInt();
		for(int x=1;x<=5;x++) {
			System.out.println(i+"*"+x+"="+x*i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		Multiple t1= new Multiple();
		Multipleof9 t2 = new Multipleof9();
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
	}
}
