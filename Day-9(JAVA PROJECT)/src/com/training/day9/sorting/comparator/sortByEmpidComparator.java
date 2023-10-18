package com.training.day9.sorting.comparator;

import java.util.Comparator;

public class sortByEmpidComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getEmployeeid(), o2.getEmployeeid());
	}

}
