package com.training.Day2;
import java.util.Scanner;
class student{
		private int studentId;
		private String studentName;
		private int score;
		private Scanner sc;
		public void accept(){
			sc=new Scanner(System.in);
			System.out.println("Enter the Student ID");
			studentId=sc.nextInt();
			System.out.println("Enter the Student Name");
			studentName=sc.next();
			System.out.println("Enter the Student Score");
			score=sc.nextInt();
			}
		public void display(){
		System.out.println("The student Id is" + " " +studentId);
		System.out.println("The student Name is" + " "+ studentName);
		System.out.println("The student Score is" + " "+ score);
		}
		public static void main(String arg[]){
			student obj = new student();
			obj.accept();
			obj.display();
		}
}
