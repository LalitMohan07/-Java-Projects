package com.training.Day2;

class Array3{
	int num[]={10,12,20,30,25,40,32,31,35,50,60};
	public void display(){
		for(int i=3;i<8;i++){
			System.out.println(num[i]);
	}
}
	public static void main(String arg[]){
		Array3 obj = new Array3();
		obj.display();
	}
}