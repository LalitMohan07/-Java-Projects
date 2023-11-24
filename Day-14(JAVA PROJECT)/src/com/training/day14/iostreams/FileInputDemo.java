package com.training.day14.iostreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputDemo {
	FileOutputStream output;
	public void writeData() {
		try {
			String str ="Input output example";
			output= new FileOutputStream("/home/administrator/Documents/RMGB_Final_prod_Code/LMS1.txt",true);
			output.write(str.getBytes());
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void readData() {
		try {
			FileInputStream finput = new FileInputStream("/home/administrator/Documents/RMGB_Final_prod_Code/LMS1.txt");
			byte data[]= new byte[finput.available()];
			finput.read(data);
			for(int x=0;x<data.length;x++) {
				System.out.print((char)data[x]);
					}
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());			
		}
		catch(IOException e) {
			System.out.println(e.getMessage());			

		}
	}
	public static void main(String[] args) {
		System.out.println("Reading data");
		FileInputDemo fdemo = new FileInputDemo();
		fdemo.writeData();
		fdemo.readData();
		
	}
}
