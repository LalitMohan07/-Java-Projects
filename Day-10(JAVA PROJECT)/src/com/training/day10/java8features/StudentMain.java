package com.training.day10.java8features;
import java.util.*;
public class StudentMain {
	List<Student> stdlist;
	public StudentMain() {
		stdlist = new LinkedList<Student>();
	}
	public void insert() {
		Student s1= new Student(1,"Lalit",84.0);
		Student s2= new Student(2,"mahi",94.0);
		Student s3= new Student(3,"kite",70.0);
		stdlist.add(s1);
		stdlist.add(s2);
		stdlist.add(s3);

		
	}
	public void display() {
		stdlist.forEach(stobj->{
			System.out.println("THe student name is "+stobj.getStudentname());
			System.out.println("THe student id is "+stobj.getStudentid());
			System.out.println("THe student score is "+stobj.getScore());

		});
	}
	public static void main(String[] args) {
		StudentMain smain = new StudentMain();
		smain.insert();
		smain.display();
	}
}
