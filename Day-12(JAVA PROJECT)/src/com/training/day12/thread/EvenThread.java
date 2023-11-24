package com.training.day12.thread;

public class EvenThread   extends Thread{
	public void run() {
		if(Thread.currentThread().getName().equals("EvenThread")) {
			System.out.println("Inside even thread");
			for(int x=1;x<20;x++) {
				if(x%2==0) {
					
					System.out.println("THe even no value is  "+x);
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		}
		else if(Thread.currentThread().getName().equals("OddThread")) {
			System.out.println("Inside odd thread");

			for(int x=1;x<20;x++) {
				if(x%2!=0) {
					
					System.out.println("THe odd no value is  "+x);
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	

}
