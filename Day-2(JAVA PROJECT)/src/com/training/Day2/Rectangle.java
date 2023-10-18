package com.training.Day2;
import java.util.Scanner;
class Rectangle{
	 double length;
	 double breadth;
	 double area;
	 Scanner sc;
	public double Area(float length,float breadth){
	return length*breadth;

	}
	public static void main(String arg[]){
	Rectangle obj= new Rectangle();


	System.out.println("The Area of Rectangle1 is"+" "+	obj.Area(4,5));
        Rectangle obj1= new Rectangle();
	
	System.out.println("The Area of Rectangle2 is"+" "+	obj1.Area(8,7));
}
}
