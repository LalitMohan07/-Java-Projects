package com.training.day13;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class callableWithFutureDemo implements Callable<String>{

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(1000);
		return Thread.currentThread().getName();
	}
	public static void main(String[] args) {
		ExecutorService executor= Executors.newCachedThreadPool();
		List<Future<String>> list= new ArrayList<Future<String>>();
		Callable<String> callable = new callableWithFutureDemo();
		for(int i=0;i<100;i++) {
			Future<String> future = executor.submit(callable);
			list.add(future);
		}
		for(Future<String> fut:list) {
			try {
				System.out.println(new Date()+"::"+fut.get());
			}
			catch(InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
		executor.shutdown();// to shutdown the executor service
	}

}

