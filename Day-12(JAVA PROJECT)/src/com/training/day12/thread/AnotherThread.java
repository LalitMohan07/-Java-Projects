package com.training.day12.thread;

public class AnotherThread extends Thread {
	public void run() {
		for(int x=10;x>=5;x--) {
			System.out.println("Another thread value is "+x);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
