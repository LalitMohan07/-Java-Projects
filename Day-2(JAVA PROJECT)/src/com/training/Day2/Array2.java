package com.training.Day2;
import java.util.Scanner;
class Array2{
	int num[];
	int totalNumber;
	Scanner sc;
	public Array2(){
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
	public void positive(){
		int count=0;
		for(int value:num){
			if(value>0){
					count++;
			}

	}
		System.out.println("Total Positive integers are"+" "+count);
}
	public void negative(){
		int count=0;
		for(int value:num){
			if(value<0){
					count++;
			}

	}		System.out.println("Total Negative integers are"+" "+count);
}
	public void even(){
		int count=0;
		for(int value:num){
			if(value%2==0){
					count++;
			}

	}		System.out.println("Total Even numbers are"+" "+count);
}
	public void odd(){
		int count=0;
		for(int value:num){
			if(value%2!=0){
					count++;
			}

	}		System.out.println("Total Odd numbers are"+" "+count);
}
	public void zero(){
		int count=0;
		for(int value:num){
			if(value==0){
					count++;
			}

	}		System.out.println("Total 0's are"+" "+count);
}
	public static void main(String arg[]){
		Array2 obj = new Array2();
		obj.AcceptValues();
		obj.positive();
		obj.negative();
		obj.even();
		obj.odd();
		obj.zero();
	}
}
