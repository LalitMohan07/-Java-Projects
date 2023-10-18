package com.training.day10.java8features;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlatMap {
public static void main(String[] args) {
	List<Integer> list1 = Arrays.asList(14,45,25,69);
	List<Integer> list2 = Arrays.asList(47,05,5,79);
	List<List<Integer>> newlist = Arrays.asList(list1,list2);
	System.out.println("As before");
	System.out.println(newlist);
	List<Integer> mergelist = newlist.stream().flatMap(str->str.stream()).collect(Collectors.toList());
	System.out.println(mergelist);
	Map<Integer,String> mapd = new HashMap<Integer,String>();
	mapd.put(101, "kol");
	mapd.put(102, "lms");
	mapd.put(103, "kola");
	mapd.put(1014, "klm");
	mapd.entrySet().stream().filter(d->d.getKey()==102).forEach(n->{
		System.out.println(n.getValue());
	});


}
}
