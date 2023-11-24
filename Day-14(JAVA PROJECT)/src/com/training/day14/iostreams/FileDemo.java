package com.training.day14.iostreams;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	private File fdir;
	private  File ffile;
	public FileDemo() {
		fdir= new File("/home/administrator/Documents/RMGB_Final_prod_Code/LMS");
		ffile= new File("/home/administrator/Documents/RMGB_Final_prod_Code/Day-3(JAVA PROJECT)/bin/com/training");
	}
	public void checkProperties() {
		System.out.println("File is directory or not "+fdir.isDirectory());
		System.out.println("File or directory for another object "+ffile.isFile());
		System.out.println("parent folder is "+fdir.getParentFile());
		System.out.println("Absolute path "+ffile.getAbsolutePath());
		
		try {
			System.out.println("Creating a file "+fdir.createNewFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("is file can read "+fdir.canRead());
		System.out.println("is file can write "+fdir.canWrite());

		boolean result= fdir.mkdirs();
		if(result) {
			System.out.println("Directory created");
			
		}
		else{
			System.out.println("Not created");
		}
		String filenames[]=ffile.list();
		for(String name:filenames) {
			System.out.println("file names are "+name);
		}
			
		
		
		
	}
	public static void main(String[] args) {
		FileDemo fdemo = new FileDemo();
		fdemo.checkProperties();
	}
	
}
