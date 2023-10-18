package com.training.Day1;
class swap{
	public static void main(String args[]){
	int number1=4;
	int number2=7;
 	System.out.println("The 1st number before swap is"+" "+number1+" "+"THe 2nd number before swap is"+" "+number2);
	number1=number2-number1;
	number2=number2-number1;
	number1=number1+number2;
	System.out.println("The 1st number after swap is"+" "+number1+" "+"THe 2nd number after swap is"+" "+number2);
}
}
