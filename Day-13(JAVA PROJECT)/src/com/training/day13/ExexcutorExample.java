package com.training.day13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExexcutorExample  {
	public static void main(String[] args) {
		//ExecutorService executord = Executors.newFixedThreadPool(20);
		//ExecutorService executord = Executors.newCachedThreadPool();
		ExecutorService executord = Executors.newSingleThreadExecutor();

		for(int x=1;x<=100;x++ ) {
			Runnable r1= new ThreadDemo();
			executord.execute(r1);
		}
	}
}
class ThreadDemo implements Runnable{
	public void run() {
		System.out.println("Thtread name is "+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
