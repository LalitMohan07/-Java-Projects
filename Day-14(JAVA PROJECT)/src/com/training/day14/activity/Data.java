package com.training.day14.activity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Data {
	Scanner sc;
	FileOutputStream output;
	public Data() {
		sc= new Scanner(System.in);
	}
	public void writedata() {
		try {
			
			System.out.println("Enter the string u want to add in the file ");
			String str = sc.next();
			output= new FileOutputStream("/home/administrator/Documents/RMGB_Final_prod_Code/LMS3.txt",true);
			output.write(str.getBytes());
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}	
		}
	public void readdata() {
		try {

			FileInputStream finput = new FileInputStream("/home/administrator/Documents/RMGB_Final_prod_Code/LMS3.txt");
		
			byte data[]= new byte[finput.available()];
			if(data.length == 0) {
				System.out.println("Add data to the file");
			}
			else {
				
				finput.read(data);
				for(int x=0;x<data.length;x++) {
					System.out.print((char)data[x]);
				}
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
	/*public static void main(String[] args) {
		Data dobj = new Data();
		dobj.readdata();
		dobj.writedata();
	}*/

}
