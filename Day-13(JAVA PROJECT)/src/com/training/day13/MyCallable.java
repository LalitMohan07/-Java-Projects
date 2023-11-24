package com.training.day13;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String>{

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return Thread.currentThread().getName();
	}
	private long waitTime;
	public MyCallable(int timeinmillis) {
		this.waitTime=timeinmillis;
	}
	
}
