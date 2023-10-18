package com.training.day7.collections.activity2;

import java.util.*;

public class ListDemo {
	private List<String> arrl ;
	public ListDemo() {
		arrl = new ArrayList<String>();
		arrl.add("Hello");
		arrl.add("to");
		arrl.add("java");
		arrl.add("program");
		display();
		System.out.println("Removing data");
		arrl.remove("program");
		if(arrl.contains("java"))
		{
			System.out.println("part of arraylist");
		}
	}
	public void display() {
		for(String s:arrl) {
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		ListDemo l = new ListDemo();
		l.display();
	}
	
}
