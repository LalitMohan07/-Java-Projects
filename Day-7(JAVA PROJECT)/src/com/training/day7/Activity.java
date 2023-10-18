package com.training.day7;

public class Activity {
	private static String s="Welcome to java world";
	public static void main(String[] args) {
		System.out.println("The Charcter at 5th position is "+s.charAt(5));
		System.out.println(s+" ,Let us Learn");
		System.out.println("The first occurence of charcter a is in "+ s.indexOf('a'));
		System.out.println("Replacing all occurences of a with e "+s.replace('a','e'));
		System.out.println("String between 4th To 10th is  "+s.substring(4,10));
		System.out.println("Lowercase - "+s.toLowerCase() );
		System.out.println("Lowercase - "+s.toUpperCase() );
		System.out.println(s.contains("world"));
		System.out.println(s.length());


	}
}
