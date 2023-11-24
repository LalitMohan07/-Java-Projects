package com.training.day15.readerwriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class FIleReader {
	FileReader freader ;
	FileWriter fwriter;
	Scanner sc;
	File f1;
	
	

	public FIleReader() throws IOException{
		f1= new File("/home/administrator/Desktop/JavaProgram/Hello/hello1.txt");
		fwriter = new FileWriter(f1);
		freader= new FileReader(f1);
		sc= new Scanner(System.in);
	}
	public void reader() throws IOException {
		System.out.println("hii");
		freader.skip(0);
	char ch[]= new char[200];
	freader.read(ch);
	for(int x=0;x<ch.length;x++) {
		System.out.print(ch[x]);
	}
	
	}
	
	public void writer() throws IOException {
		System.out.println("Enter content");
		String str = sc.next();
		fwriter.write(str);
		System.out.println("Data written");
	}
	
	
	public static void main(String[] args) throws IOException {
		
		try{
			FIleReader fr = new FIleReader();
			fr.writer();
			fr.reader();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
