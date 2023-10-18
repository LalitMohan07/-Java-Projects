package com.training.day10.java8features;

import java.util.Comparator;

public class sortByNameComparator implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {
		// TODO Auto-generated method stub
		return o1.getMoviename().compareTo(o2.getMoviename());
	}

}
