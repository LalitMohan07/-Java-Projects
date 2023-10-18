package com.training.day7;

public class Activity2 {
	static StringBuffer strbuf = new StringBuffer("This is a StringBuffer ");

public static void main(String[] args) {
	System.out.println(strbuf + "- This is sample program");
	System.out.println(strbuf.insert(21, "object"));
	//System.out.println(strbuf.reverse());
	System.out.println(strbuf.replace(16,21, "Builder"));
}
}
