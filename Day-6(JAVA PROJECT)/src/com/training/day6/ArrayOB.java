package com.training.day6;

import java.util.Scanner;

public class ArrayOB {
	Scanner sc;
	int arr[] ;
	public void display() {
		arr= new int[5];
		sc= new Scanner(System.in);
		try {
			for(int i = 0;i<=arr.length;i++) {
				System.out.println("Enter the number ");
				arr[i]=sc.nextInt();
			}
		}
			catch(ArrayIndexOutOfBoundsException ex) {
				System.out.println("Trying to give input");
			}
		}
	
		public static void main(String args[]) {
			ArrayOB ar = new ArrayOB();
			ar.display();
		}
	}

