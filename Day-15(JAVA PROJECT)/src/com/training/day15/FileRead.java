package com.training.day15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FileRead {
	FileInputStream input ;
	ObjectInputStream inputobj;
	public FileRead() throws IOException {
		input= new FileInputStream("/home/administrator/Desktop/JavaProgram/Hello/hello2.txt");
		inputobj = new ObjectInputStream(input);
	}
	/*public void readdata() throws ClassNotFoundException, IOException {
		Product p1 = (Product)inputobj.readObject();
		System.out.println("product name from file is "+p1.getProductname());
		System.out.println("product price from file is "+p1.getPrice());
		System.out.println("total sales is  "+p1.getTotalSale());

	}*/
	public void showdata() {
		try {
			while(input.available()>0) {
				Product p1 = (Product)inputobj.readObject();
				System.out.println("product name is "+p1.getProductname());
			}
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		FileWrite fwr = new FileWrite();
		fwr.writedata();
		FileRead fre = new FileRead();
		fre.showdata();
	}
}
