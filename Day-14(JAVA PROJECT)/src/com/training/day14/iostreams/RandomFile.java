package com.training.day14.iostreams;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomFile {
	private RandomAccessFile random;
	public RandomFile() {
		try {
			
			random= new RandomAccessFile( "/home/administrator/Documents/RMGB_Final_prod_Code/LMS.txt","rw");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void readdata() {
		try {
			random.seek(0);
			int length=(int)random.length();
			byte b[]=new byte[length];
			 random.read(b);
			 for(int x=0;x<b.length;x++)
			 {
				 System.out.print((char)b[x]);
			 }
			//System.out.println("String is "+b.toString());
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	} 	
	public void writedata() {
		try {
			random.seek(random.length()+1);
			System.out.println("current position of cursor is "+random.getFilePointer());
			String newstr= "Its a sunny day";
			random.writeBytes(newstr);
			System.out.println("Data written in file");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		RandomFile rfile = new RandomFile();
		//rfile.readdata();
		rfile.writedata();
		System.out.println("Reading again ");
		rfile.readdata();
	}
	
	
}
