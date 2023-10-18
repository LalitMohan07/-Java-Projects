package com.training.day8;


import java.util.concurrent.ArrayBlockingQueue;

public class FixedSizeQueueDemo {
	ArrayBlockingQueue<Integer> arrqueue;
	public FixedSizeQueueDemo() {
		arrqueue = new ArrayBlockingQueue<>(5);
		
	}
	public void insert() {
		arrqueue.offer(45);
		arrqueue.offer(5);
		arrqueue.offer(50);
		arrqueue.offer(4);
		arrqueue.offer(85);
		arrqueue.offer(45);
	
	}
	public void display() {
		while(!arrqueue.isEmpty()) {
			System.out.println("value is "+arrqueue.remove());
		}
	}
	public static void main(String[] args) {
		FixedSizeQueueDemo fixed = new FixedSizeQueueDemo();
	
	
	fixed.insert();
	fixed.display();
}
}
