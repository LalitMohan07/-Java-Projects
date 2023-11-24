package com.training.day13.lock;


	import java.util.concurrent.ExecutorService;
	import java.util.concurrent.Executors;
	import java.util.concurrent.locks.ReentrantLock;  

	public class LockExample  
	{  
	    // define final value for MAX_VAL  
	    static final int MAX_VAL = 2;  
	    // main() method start  
	    public static void main(String[] args)  
	    {  
	        // create instance of the ReentrantLock  
	         ReentrantLock lock = new ReentrantLock();  
	         // create thread pool by using ExecutorService class  
	         ExecutorService pool = Executors.newFixedThreadPool(2);  
	         Runnable wt1 = new workerThread(lock, "Job1");  
	         Runnable wt2 = new workerThread(lock, "Job2");  
	         Runnable wt3 = new workerThread(lock, "Job3");  
	         Runnable wt4 = new workerThread(lock, "Job4");  
	         // execute jobs by using execute() method of ExecutorService  
	         pool.execute(wt1);  
	         pool.execute(wt2);  
	         pool.execute(wt3);  
	         pool.execute(wt4);  
	         // shutdown pool  
	         pool.shutdown();  
	    }  
	}



