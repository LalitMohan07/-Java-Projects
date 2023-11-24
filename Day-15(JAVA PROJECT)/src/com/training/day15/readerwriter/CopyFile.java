package com.training.day15.readerwriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {
	FileReader freader;
	FileWriter fwriter;
	public CopyFile() throws IOException  {
		freader= new FileReader("/home/administrator/Desktop/JavaProgram/Hello/input");
		fwriter = new FileWriter("/home/administrator/Desktop/JavaProgram/Hello/output.txt",true);
		
	}
	public void copyData() throws IOException {
		int i;
		while((i=freader.read())!=-1) {
			System.out.print((char)i);
			fwriter.write((char)i);
			fwriter.flush();
		}
		System.out.println("Data copied");
	}public static void main(String[] args) {
		try {
			CopyFile cpy = new CopyFile();
			cpy.copyData();
		}
		catch(IOException e) {
			e.getMessage();
		}
	}
	}
