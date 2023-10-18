package com.training.day9.sorting.comparator;

import java.util.Comparator;

public class sortByNameComparator implements Comparator<Employee> {



	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getEmployeename().compareTo(o2.getEmployeename());
	}

}
