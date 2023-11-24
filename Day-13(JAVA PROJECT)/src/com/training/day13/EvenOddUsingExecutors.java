package com.training.day13;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

public class EvenOddUsingExecutors implements Callable<String>{

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "number is";
	}
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(10);
		List<String> evenlist= new ArrayList<String>();
		List<String> oddlist= new ArrayList<String>();

		Callable<String> callable = new EvenOddUsingExecutors();
		for(int i=1;i<10;i++) {
			if(i%2==0) {
				
				Future<String> future = executor.submit(callable);
				try {
					String str = future.get();
					evenlist.add(str+"Even number "+i);
				}
				catch(InterruptedException | ExecutionException e){
					e.printStackTrace();
				}
			}
			else {
				Future<String> future = executor.submit(callable);
				try {
					String str = future.get();
					oddlist.add("odd number "+i);
				}
				catch(InterruptedException | ExecutionException e){
					e.printStackTrace();
				}			}
				
			}
		for(String fut: evenlist) {
			System.out.println(new Date()+"::"+fut);
		}
		for(String fut: oddlist) {
			System.out.println(new Date()+"::"+fut);
		}
		executor.shutdown();
		}
		
}
