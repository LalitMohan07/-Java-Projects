package com.training.demo;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) {
		File f1= new File("/home/administrator/Desktop/JavaProgram/Hello/Exam.txt");
		try {
			if(f1.createNewFile()) {
				System.out.println("File is created");
			}
			else {
				System.out.println("file already exist");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//f1.delete();
	}
}
