package com.training.day15.activity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.training.day15.Product;

public class DepartmentMain {
   Department dobj;
   Scanner sc;
   File f1;
   FileInputStream fis;
   ObjectInputStream ois;
   public DepartmentMain() throws IOException {
	   dobj= new Department();
	   sc= new Scanner(System.in);
	   f1 = new File("/home/administrator/Desktop/JavaProgram/Hello/department.txt");
	    fis = new FileInputStream(f1);
	    ois= new ObjectInputStream(fis);
	   
	  }
   public void writedata() {
	   
	   System.out.println("Enter the no of departmentu want tyo have ");
	   int noofdept = sc.nextInt();
	   for(int x=1;x<=noofdept;x++) {
		   System.out.println("ENter the code of department ");
		   dobj.setDeptcode(sc.nextInt());
		   System.out.println("ENter the name of department ");
		   dobj.setDeptname(sc.next());
		   System.out.println("Enter the no of employees u want to have ");
		   int noofemp = sc.nextInt();
		   for(int i=1;i<=noofemp;i++) {
			   Employee e = new Employee();
			   System.out.println("ENter the id of employee ");
			   e.setEmployeeid(sc.nextInt());
			   System.out.println("ENter the name of employee ");
			   e.setEmployeename(sc.next());
			   System.out.println("Enter the salary ");
			   e.setSalary(sc.nextDouble());
			   dobj.setEmp(e);
		   }
		   
			      try (FileOutputStream fos = new FileOutputStream(f1);
			           ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			          oos.writeObject(dobj);
			          oos.flush();
			      } catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			  }			
	   
	   }
   public void readdata() throws ClassNotFoundException {
	   try {
		   while(fis.available()!=0) {
			   Department p1 = (Department)ois.readObject();
			   System.out.println("THe Department name is "+dobj.getDeptname());
			   System.out.println("The employee id is "+dobj.getEmp().getEmployeeid());
			   System.out.println("The employee name is "+dobj.getEmp().getEmployeename());

		   }
	   }
	   catch(IOException e) {
		   e.printStackTrace();
	   }
   }
   
   public static void main(String[] args) throws ClassNotFoundException {
	DepartmentMain dmain;
	try {
		dmain = new DepartmentMain();
		dmain.writedata();
		dmain.readdata();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
   
  
}
