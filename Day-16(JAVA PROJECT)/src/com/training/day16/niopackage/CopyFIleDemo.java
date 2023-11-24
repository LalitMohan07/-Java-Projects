package com.training.day16.niopackage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFIleDemo {
	public static void main(String[] args) {
		Path path1 = Paths.get("/home/administrator/Desktop/JavaProgram/Hello/input");
		Path path2= Paths.get("/home/administrator/Desktop/JavaProgram/Hello/output1.txt");
		try {
			Files.copy(path1, path2);
			System.out.println("Data copied");
		}catch(IOException e) {
			e.printStackTrace();
		}

	}
}
