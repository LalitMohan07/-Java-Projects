package com.training.day10.activity;
import java.util.*;
public class EvenOdd {
	List<Integer> listint;
	public EvenOdd() {
		listint= new LinkedList<Integer>();
	}
	public void insert() {
		listint.add(45);
		listint.add(50);
		listint.add(445);
		listint.add(485);
		listint.add(4500);

	}public void display() {
		listint.forEach(i->{
			System.out.println("The integer is "+i);
		});
	}
	public void Check() {
		listint.forEach(i->{
			if(i%2==0) {
				System.out.println("It is an EVen no");
			}
			else {
				System.out.println("It is an Odd no");

			}
		});
	}
	public static void main(String[] args) {
		EvenOdd en = new EvenOdd();
		en.insert();
		en.display();
		en.Check();
	}
}
