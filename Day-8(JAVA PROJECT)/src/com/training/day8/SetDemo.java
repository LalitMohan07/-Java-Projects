package com.training.day8;

import java.util.*;

public class SetDemo {
	private Set<String> setd;
	Scanner sc;
	public SetDemo() {
		setd= new HashSet<String>();
		sc= new Scanner (System.in);
	}
	public void accept() {
		System.out.println("Enter the number of string u want to have ");
		int noofstring=sc.nextInt();
		for(int e=0;e<noofstring;e++) {
			System.out.println("Enter Any string");
			setd.add(sc.next());
			

			
		}
		
	}
	public void  display() {
		for(String s:setd) {
			System.out.println("The String is "+s);
		}
	}
	public static void main(String[] args) {
		SetDemo setd = new SetDemo();
		setd.accept();
		setd.display();
	}
	
}
