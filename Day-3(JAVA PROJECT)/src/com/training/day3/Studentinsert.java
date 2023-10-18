package com.training.day3;
import java.util.Scanner;


public class Studentinsert {
	private Scanner sc;
	private Student studentarr[];
	private int checkStudentid;
	public Studentinsert() {
		sc= new Scanner(System.in);
		System.out.println("Enter the no of students you want to insert ");
		int noofstudent=sc.nextInt();
		studentarr=new Student[noofstudent]; 
	}
	public void acceptDetails(){
		for(int x=0;x<studentarr.length;x++) {
			studentarr[x]=new Student();
			System.out.println("Enter the Student id ");
			studentarr[x].setStudentid(sc.nextInt());
			System.out.println("Enter the Student Name ");
			studentarr[x].setStudentname(sc.next());
			System.out.println("Enter the Student Score ");
			studentarr[x].setScore(sc.nextDouble());
			
		}
	}
	public void searchByStudentid() {
		System.out.println("Enter the studentid you want to check");
		checkStudentid=sc.nextInt();
		Student sfound=null;
		for(Student sr:studentarr) {
			if(checkStudentid == sr.getStudentid()) {
				sfound=sr;
				System.out.println("Enter the new Score ");
				sr.setScore(sc.nextDouble());
				
			}
		}	if(sfound!=null) {
			System.out.println("The student id is present in the array");

		}else {
			
			System.out.println("The student id is not present in the array");
		}

	}
	public void displayDetails() {
		for(Student s:studentarr) {
			System.out.println("The student id is"+" "+s.getStudentid());
			System.out.println("The student Name is"+" "+s.getStudentname());
			System.out.println("The student Score is"+" "+s.getScore());
		}
	
	}
	public static void main(String args[]) {
		Studentinsert str = new Studentinsert();
		str.acceptDetails();
		str.searchByStudentid();
		str.displayDetails();

	}
			}
	
