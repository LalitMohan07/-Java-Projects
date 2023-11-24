package com.training.day12.thread;

public class FirstRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int x=1;x<30;x++) {
			if(x%2==0) {
				System.out.println("Even no is "+x);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		
		FirstRunnable t1= new FirstRunnable();
		Thread t= new Thread(t1);
 		Thread t2= new Thread(t1);

		t.start();
		t2.start();
	}

}
