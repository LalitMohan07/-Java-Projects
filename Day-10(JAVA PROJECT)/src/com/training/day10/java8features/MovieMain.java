package com.training.day10.java8features;

import java.util.*;

public class MovieMain {
	List<Movie> movielist;
	Scanner sc;
	public MovieMain() {
		movielist= new LinkedList<Movie>();
		sc= new Scanner(System.in);
	}
	public void accept() {
		System.out.println("ENter the no of movies u want to have ");
		int noofmovie=sc.nextInt();
		for(int x=1;x<=noofmovie;x++) {
			Movie m= new Movie();
			System.out.println("ENter the no ");
			m.setMovieno(sc.nextInt());
			System.out.println("ENter the name of movie ");
			m.setMoviename(sc.next());
			System.out.println("ENter the duration of movie ");
			m.setMovieduration(sc.nextDouble());
			System.out.println("ENter the price of ticket ");
			m.setMovieprice(sc.nextDouble());
			System.out.println("ENter the category ");
			m.setCategory(sc.next());
			movielist.add(m);


		}
	}
	public void filterByPrice() {
		movielist.stream().filter
		(movieobj->movieobj.getMovieprice()>500).
		forEach(data->{
			System.out.println(data.getMoviename());
		});
	}
	public void filterByCategory() {
		System.out.println("ENter the category u want to watch");
		String chk=sc.next();
		movielist.stream().filter(move->move.getCategory().equals(chk)).forEach(data->{
			System.out.println(data.getMoviename());
			System.out.println(data.getMovieno());

		});
		movielist.stream().sorted(new sortByNameComparator()).forEach(e->{
			System.out.println(e.getMoviename());
		});;
	}
	
	public static void main(String[] args) {
		MovieMain main = new MovieMain();
		main.accept();
		main.filterByCategory();
		main.filterByPrice();
	}
}
