package com.training.day14.iostreams;

import java.io.File;

public class RetrieveFIles {
	File f1;
	public static  void Display(File fsearch) {
		System.out.println("Main directory name is "+fsearch);
		File farray[]= fsearch.listFiles();
		for(File fobj:farray) {
			if(fobj.isDirectory()) {
				System.out.println("Directory  name is "+fobj.getName());
				Display(fobj);
			}
			else {
				System.out.println("file name is "+fobj.getName());

			}
		}
	}
	public static void main(String[] args) {
		Display(new File("/home/administrator/Documents/RMGB_Final_prod_Code/Day-3(JAVA PROJECT)"));
	}
}
