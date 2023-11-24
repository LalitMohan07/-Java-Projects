package com.training.client;

import java.sql.SQLException;
import java.util.Scanner;

import com.training.service.MovieService;

public class MovieMenu {
	MovieService movieservice;
	int choice;
	String ch ="y";
	Scanner sc;
	
	
	public MovieMenu() {
		sc= new Scanner(System.in);
		movieservice = new MovieService();
	}
	public void Menu() throws Exception {
		while(ch.equals("y")) {
			
			System.out.println("1.Insert Movie");
			System.out.println("2.Show all Movies");
			System.out.println("3.Delete Movie");
			System.out.println("4.Update Movie");
			System.out.println("5.Exit");
			System.out.println("6.Retrieve total price");
			System.out.println("7.Show movie details by movie name");
			System.out.println("8.Show movie details where price is greater than 500");

			
			choice = sc.nextInt();
			switch(choice){
			case 1:
				movieservice.insertMovie();
				break;
			case 2:
				movieservice.retrieveData();
				break;
			case 3:
				movieservice.deleteMovie();
				break;
			case 4:
				movieservice.updateMovie();
				break;
			case 5:
				System.exit(0);
				break;
			case 6:
				movieservice.totalMoviePrice();
				break;
			case 7:
				movieservice.MovieDetails();
				break;
			case 8:
				movieservice.MoviePrice();
				break;
			}
			System.out.println("Do you want to continue(Y/N");
			ch=sc.next();
		}

	}
	
}
