package com.training.Day1;

import java.util.Scanner;
class circle{
	public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the radius");
	float radius=sc.nextFloat();
	float pi=3.14f;
	float area=pi*radius*radius;
	float perimeter = 2*pi*radius;
	System.out.println("The Area of a circle is"+" "+area);
	System.out.println("The Perimeter of a circle is"+" "+perimeter);
}
}

