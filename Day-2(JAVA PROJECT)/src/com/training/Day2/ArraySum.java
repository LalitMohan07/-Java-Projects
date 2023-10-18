package com.training.Day2;
import java.util.Scanner;
class ArraySum{
	int num[];
	int totalNumber;
	Scanner sc;
	public ArraySum(){
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
	public void calculateSum(){
		int sum=0;
		for(int value:num){
			 sum = sum+value;

			
		}
		System.out.println("The sum of elements of array num is"+" "+sum);
	}
	public static void main(String arg[]){
	ArraySum obj = new ArraySum();
	obj.AcceptValues();
	obj.calculateSum();
	}
}
	
