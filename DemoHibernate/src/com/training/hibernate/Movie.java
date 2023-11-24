package com.training.hibernate;

public class Movie {
	private int moviecode;
	private String movietitle;
	private double price;
	private int duration;
	public int getMoviecode() {
		return moviecode;
	}
	public void setMoviecode(int moviecode) {
		this.moviecode = moviecode;
	}
	public String getMovietitle() {
		return movietitle;
	}
	public void setMovietitle(String movietitle) {
		this.movietitle = movietitle;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
}
