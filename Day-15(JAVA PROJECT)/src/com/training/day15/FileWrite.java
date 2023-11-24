package com.training.day15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class FileWrite {
	FileOutputStream output;
	ObjectOutputStream outputobj;
	Scanner sc;
	public FileWrite() {
		try {
			output= new FileOutputStream("/home/administrator/Desktop/JavaProgram/Hello/hello2.txt",true);
			outputobj = new ObjectOutputStream(output);
			sc= new Scanner(System.in);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	public void writedata() {
		Product p;
		System.out.println("ENter the no of products u wnt to have ");
		int noofproducts =sc.nextInt();
		for(int x=1;x<=noofproducts;x++) {
			
			p = new Product();
			System.out.println("Enter the product id ");
			p.setProductid(sc.nextInt());
			System.out.println("Enter the product Name");
			p.setProductname(sc.next());
			System.out.println("Enter the product Price ");
			p.setPrice(sc.nextDouble());
			System.out.println("Enter the product quantity");
			p.setQuantity(sc.nextInt());
			System.out.println("Enter the total product sale ");
			p.setTotalSale(sc.nextDouble());
			try {
				outputobj.writeObject(p);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		 }
			
		}
		
	}

