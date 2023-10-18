package com.training.day8;

import java.util.*;

public class queuqDemo {
	public static void main(String[] args) {
		Queue<String> queuedemo= new LinkedList<>();
		queuedemo.offer("hello");
		queuedemo.offer("World");
		queuedemo.add("hii");
		queuedemo.add("hii");
		System.out.println("first value to come out is "+queuedemo.remove());
		System.out.println("second value to come out is "+queuedemo.poll());
		System.out.println("third value to come out is "+queuedemo.remove());
		System.out.println("fourth value to come out is "+queuedemo.poll());
		System.out.println("fifth value to come out is "+queuedemo.poll());

	}
}
