package com.training.service;

import java.sql.SQLException;
import java.util.*;

import com.training.dao.MovieDAO;
import com.training.dto.Movie;

public class MovieService {
	private Scanner sc;
	private MovieDAO moviedao;
	private List<Movie> moviedata;
	public MovieService() {
		sc= new Scanner(System.in);
		moviedao = new MovieDAO();
		moviedata= new ArrayList<Movie>();
	}
	public void insertMovie() throws SQLException {
		System.out.println("Enter the no of movies u want to add ");
		int noofmovie = sc.nextInt();
		for(int x=1;x<=noofmovie;x++) {
			Movie mov = new Movie();
			System.out.println("Enter the movie id ");
			mov.setMovieid(sc.nextInt());
			System.out.println("Enter the movie Name ");
			mov.setMoviename(sc.next());
			System.out.println("Enter the movie duration ");
			mov.setDuration(sc.nextInt());
			System.out.println("Enter the movie Price ");
			mov.setPrice(sc.nextDouble());
			moviedata.add(mov);
			//moviedao.insertData(mov);
		}
		moviedao.insertData(moviedata);

	}
	public void retrieveData() throws SQLException {
		List<Movie> movieretrieve = moviedao.getDetails();
		for(Movie m:movieretrieve) {
			System.out.println("Movie title is "+m.getMoviename() );
			System.out.println("Movie price is "+m.getPrice() );

			
		}
		
	}
	public void deleteMovie() throws SQLException {
		System.out.println("Enter the movie id u want to delete ");
		moviedao.deleteData(sc.nextInt());
	}
	public void updateMovie() throws SQLException {
		System.out.println("Enter the price of the movie u wnt gto update and the movie id");
		moviedao.updateData(sc.nextDouble(),sc.nextInt());
	}
	public void totalMoviePrice() throws SQLException {
		moviedao.totalPrice();
	}
	public void MovieDetails() throws Exception {
		System.out.println("Enter the movie name u want to show the details of");
		moviedao.movieDetails(sc.next());
	}
	public void MoviePrice() throws SQLException {
		System.out.println("Enter the amount u want to check");
		moviedao.priceGreater(sc.nextDouble());
	}
}
