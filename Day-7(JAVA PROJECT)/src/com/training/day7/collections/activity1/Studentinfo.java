package com.training.day7.collections.activity1;

import java.util.*;

public class Studentinfo {
	private List<Student> str;
	Scanner sc;
	public Studentinfo()
	{
		str = new ArrayList<Student>();
		sc= new Scanner(System.in);
		
	}
	public void Accept() {
		System.out.println("Entyer the no of Students u want to have ");
		int noofstudent=sc.nextInt();
		for(int x=0;x<noofstudent;x++) {
			Student s = new Student();
			System.out.println("Enter the student id ");
			s.setStudentid(sc.nextInt());
			System.out.println("Enter the student name ");
			s.setStudentname(sc.next());
			System.out.println("Enter the Score" );
			s.setScore(sc.nextDouble());
			str.add(s);
		}
	}
	public void findByStudentid() {
		System.out.println("Enter the student id u want to check ");
		int studentid=sc.nextInt();
		boolean found= false;
		for(Student s:str) {
			if(s.getStudentid()==studentid) {
				found=true;
				break;
			}
			else {
				found= false;
			}
		}
		if(found) {
			System.out.println("Id found");
		}
		else {
			System.out.println("ID not found");
		}
	}

	public void display() {
		for(Student s:str) {
			System.out.println("The Student id is "+s.getStudentid());
			System.out.println("The Student Name is "+s.getStudentname());
			System.out.println("The Student SCore is "+s.getScore());

		}
	}
	public void remove() {
		System.out.println("Enter the employee id u want to remove ");
		int removeid= sc.nextInt();
		Student deleteid=null;
		for(Student s:str) {
			if(s.getStudentid()==removeid) {
				deleteid=s;
				break;
			}
		}
		if(deleteid!=null){
			
			str.remove(deleteid);
		}
		
	}
	
	public void update() {
		System.out.println("Enter the Student id u want to update");
		int updateid = sc.nextInt();
		for(Student s:str) {
			if(s.getStudentid()==updateid)
			{
				System.out.println("Enter the updated student id ");
				s.setStudentid(sc.nextInt());
				System.out.println("Enter the updated student name ");

				s.setStudentname(sc.next());
				System.out.println("Enter the updated student score ");

				s.setScore(sc.nextDouble());
				
				}
			else {
				System.out.println("Employee id not found");
			}
		}
	}
	public static void main(String[] args) {
		Studentinfo std= new Studentinfo();
		std.Accept();
		std.display();
		std.findByStudentid();
		std.remove();
		std.display();

		std.update();
		std.display();

	}
}
