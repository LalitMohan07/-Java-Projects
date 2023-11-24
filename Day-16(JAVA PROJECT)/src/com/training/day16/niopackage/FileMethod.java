package com.training.day16.niopackage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileMethod {
	public static void main(String[] args) throws IOException {
		Path path3 = Paths.get("/home/administrator/Desktop/JavaProgram/Hello/men");
		
		Path path4= Paths.get("/home/administrator/Desktop/JavaProgram/Hello/output1.txt");
		Path path5 = Paths.get("/home/administrator/Desktop/JavaProgram/Hello/output1.txt");

		try {
			/*String str = "welcome";
			Path path2=Paths.get("/home/administrator/Desktop/JavaProgram/Hello");
			Path tempdir=Files.createTempDirectory(path2,str);
			System.out.println("Directory created");*/
			System.out.println("is file  deleted"+Files.deleteIfExists(Paths.get("/home/administrator/Desktop/JavaProgram/Hello/poll")));
			Files.isSameFile(path4,path5);
			System.out.println("File exists");
			System.out.println("Lines are "+Files.readAllLines(path4));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
