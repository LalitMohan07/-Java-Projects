package com.training.Day2;
import java.util.Scanner;
class Array1{
	int num[];
	int totalNumber;
	Scanner sc;
	public Array1(){
		sc=new Scanner(System.in);
		System.out.println("Enter the total numbers in an array");
		totalNumber=sc.nextInt();
		num= new int[totalNumber];
	}
	public void AcceptValues(){
		for(int index=0;index<num.length;index++){
			System.out.println("Enter the number");
			num[index]=sc.nextInt();
		}
	}
	public void question(){
		int number=0;
		System.out.println("Give a number");
		number=sc.nextInt();
		for(int index=0;index<num.length;index++){
			if(num[index]==number){
				System.out.println("THe number is present in the array");	
			}
			else if(index==num.length-1){
				System.out.println("THe number is not present in the array");	
			}
		}
}
	public static void main(String arg[]){
		Array1 obj = new Array1();
		obj.AcceptValues();
		obj.question();
	}
}
