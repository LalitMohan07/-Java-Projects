package com.training.day12.thread;

public class ThreadDemo extends Thread {
	public void run() {
		for(int x=1;x<=5;x++) {
			System.out.println("The value is "+x);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		ThreadDemo t1= new ThreadDemo();
		AnotherThread t2= new AnotherThread();
		t1.start();
		t2.start();
	}
}
