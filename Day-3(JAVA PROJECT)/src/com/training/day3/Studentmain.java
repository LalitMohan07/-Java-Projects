package com.training.day3;

public class Studentmain {
	private Student strarr[];
	public Studentmain() {
		strarr= new Student[3];
	}
	public void accept() {
		strarr[0]=new Student();
		strarr[0].setStudentid(1);
		strarr[0].setStudentname("Lalit");
		strarr[0].setScore(75);
		strarr[1]=new Student();
		strarr[1].setStudentid(2);
		strarr[1].setStudentname("Mohan");
		strarr[1].setScore(84);
		strarr[2]=new Student();
		strarr[2].setStudentid(3);
		strarr[2].setStudentname("Sahoo");
		strarr[2].setScore(90);
		
		}
	public void display() {
		for(Student s:strarr) {
		System.out.println("The student id is"+" "+s.getStudentid());
		System.out.println("The student Name is"+" "+s.getStudentname());
		System.out.println("The student Score is"+" "+s.getScore());
		}
	}
	public static void main(String arg[]) {
		Studentmain smain= new Studentmain();
		smain.accept();
		smain.display();
	}
	}
