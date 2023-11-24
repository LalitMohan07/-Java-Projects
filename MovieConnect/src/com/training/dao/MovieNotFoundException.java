package com.training.dao;

public class MovieNotFoundException extends Exception {
 public static void main(String[] args) {
	try {
		throw new MovieNotFoundException();
	}catch(MovieNotFoundException e ) {
		System.out.println("movie not found");
		System.out.println(e.getMessage());
	}
}
}
