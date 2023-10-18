package com.training.day10.java8features;

import java.util.*;

public class ForEach {
	List<String> liststr;
	public ForEach() {
		liststr= new LinkedList<String>();
	}
	public void insert() {
		liststr.add("Goodmorning");
		liststr.add("hello");
		liststr.add("whatsUp");
		liststr.add("Goodevening");
		liststr.add("How r u");

	}
	public void display() {
		liststr.forEach(s->{
			System.out.println("The String is "+s);
		});
	}
	public void check() {
		liststr.forEach(str->{
			if(str.length()>5&&str.length()<10) {
				System.out.println("Valid String");
			}
			else {
				System.out.println("InValid String");

			}
		});
	}
	public static void main(String[] args) {
		ForEach fr= new ForEach();
		fr.insert();
		fr.display();
		fr.check();
	}
}
