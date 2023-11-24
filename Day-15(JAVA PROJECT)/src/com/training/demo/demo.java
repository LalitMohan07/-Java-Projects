package com.training.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("/home/administrator/Desktop/JavaProgram/Hello/hii.txt");
		FileOutputStream fos = new FileOutputStream("/home/administrator/Desktop/JavaProgram/Hello/hii.txt",true);
		String str ="How was ur day?";
		byte b[]=str.getBytes();
		fos.write(b);
		System.out.println("Success");
		int i= 0;
		while((i=fis.read())!=-1) {
			
			System.out.print((char)i);
		}
		fos.close();
		fis.close();
	}
}
