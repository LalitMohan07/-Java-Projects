package com.practice;

public class thread implements Runnable {
 public static void main(String[] args) {
	 thread t = new thread();
	Thread t1 = new Thread(t);
	t1.start();
	t1.setName("Threadname");
	System.out.println("The current thread name is "+Thread.currentThread().getName());
	System.out.println(t1.getId());

	
 }

@Override
public void run() {
	// TODO Auto-generated method stub
	try {
		Thread.sleep(1000);
		System.out.println("Hello, welcome to java threads");
		System.out.println("The current thread name is "+Thread.currentThread().getName());
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}
