package com.training.day10.java8features;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.*;
public class Stream {
	public static void main(String[] args) {
		
		List<Integer> numberlist = Arrays.asList(10,42,78,52,46,9,7);
		System.out.println("In older way");
		numberlist.forEach(num->{
			if(num>50) {
				System.out.println("Valid number");
			}
		});
		numberlist.stream().filter(num->num>50).forEach(s->{
			System.out.println("Number greater than 50 is "+s);
		});
		numberlist.stream().map(val->val*2).forEach(newval->{
			System.out.println("After multiplying the value is "+newval);
		});
		long result =numberlist.stream().filter(num->num>50).count();
		System.out.println("The number above 50 are "+result);
		Optional <Integer> data=numberlist.stream().filter(x->x>50).findFirst();
		if(data.isPresent()) {
			System.out.println("value is"+data.get());
		}
		  numberlist.stream().filter(val->val%2==0).forEach(s->{
				System.out.println("even is"+s);
		  });
		List<String> javadevlopers= Arrays.asList("oops","class","object","int");
		List<String> netdevlopers= Arrays.asList("hello","object","int");
		List<List<String>> newlist =Arrays.asList(javadevlopers,netdevlopers);
		System.out.println("List is"+newlist);
		List<String> mergelist = newlist.stream().flatMap(val->val.stream()).collect(Collectors.toList());
		System.out.println("Mergelist is "+mergelist);
}
}
