package com.training.day9.map;

import java.util.*;

public class MapDemo {
	Map<Integer,String> mapd;
	Scanner sc;
	public MapDemo() {
		mapd= new HashMap<Integer,String>();
		sc=new Scanner(System.in);
	}
	public void operations() {
		mapd.put(1000, "Hii");
		mapd.put(1001, "Hello");
		mapd.put(1002, "How");
		mapd.put(1003, "Who");
		mapd.put(1004, "Whom");
		System.out.println("REtriveing value according to key");
		String value= mapd.get(1001);
		System.out.println("Value according to particular pair "+value);
		Set<Map.Entry<Integer, String>> mapdata= mapd.entrySet();
		for(Map.Entry<Integer, String> mapd:mapdata) {
			System.out.println("THe key is "+mapd.getKey());
			System.out.println("THe Value is "+mapd.getValue());

		}
		if(mapd.containsKey(1000)) {
			System.out.println("The key is present in the set");
		}
		
		

	}
	public void insert() {
		System.out.println("How many values u want to have in a map");
		int noofmap=sc.nextInt();
		int intialkey=1001;
		sc.nextLine();
		for(int x=1;x<=noofmap;x++){
			System.out.println("Enter the value to be inserted");
			String val=sc.next();
			mapd.put(intialkey, val);
			intialkey=intialkey+1;
		}
	}
	public void dispaly() {
		Set<Map.Entry<Integer, String>> mapdata= mapd.entrySet();

		for(Map.Entry<Integer, String> mapd:mapdata) {
			System.out.println("THe key is "+mapd.getKey());
			System.out.println("THe Value is "+mapd.getValue());

		}

	}
	public static void main(String[] args) {
		MapDemo map = new MapDemo();
		//map.operations();
		map.insert();
		map.dispaly();
	}
}
