package com.training.day13;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FutureTaskDemo {
	public static void main(String[] args) {
		MyCallable callable1 = new MyCallable(1000);
		MyCallable callable2 = new MyCallable(2000);
		
		FutureTask<String> futureTask1 = new FutureTask<String>(callable1);
		FutureTask<String> futureTask2 = new FutureTask<String>(callable2);

		 
		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.execute(futureTask1);
		executor.execute(futureTask2);
		
		while(true) {
			try {
				if(futureTask1.isDone() && futureTask2.isDone()) {
					System.out.println("Done");
					executor.shutdown();
					return;
				}
				if(!futureTask1.isDone()) {
					System.out.println("futureTask1 output="+futureTask1.get());
				}
				System.out.println("Waiting for futureTask2 to complete");
				String s=futureTask2.get(500L,TimeUnit.MILLISECONDS);
				if(s!=null) {
				 //if(!futureTask2.isDone()){
					System.out.println("FutureTask2 output="+s);
				}

			}
		
			catch(InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
			catch(TimeoutException e) {
				//do nothing
			}
		}


	}
}
