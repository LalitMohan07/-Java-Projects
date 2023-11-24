package com.training.day16.niopackage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesDemo {
	public static void main(String[] args) {
		Path p1 = Paths.get("/home/administrator/Desktop/JavaProgram/Hello/page1.txt");
		try {
			String str = "The book consists of 450 pages";
			Path path1= Files.createFile(p1);
			Files.write(path1, str.getBytes());
			System.out.println("Data written");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
