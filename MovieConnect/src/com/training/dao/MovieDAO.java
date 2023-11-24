package com.training.dao;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.training.connect.DataConnect;
import com.training.dto.Movie;
import java.sql.*;
public class MovieDAO {
	static double total =0;

	private Connection con;
	private java.sql.PreparedStatement stat;
	private List<Movie> movielist;
	public MovieDAO() {
		con=(Connection) DataConnect.getConnect();
		movielist = new ArrayList<Movie>();
	}

	public List<Movie> getDetails() throws SQLException {
		stat = (PreparedStatement) con.prepareStatement("select * from movie");
		ResultSet result = stat.executeQuery();
		while(result.next()) {
			Movie m = new Movie();
			m.setMovieid(result.getInt(1));
			m.setMoviename(result.getString(2));
			m.setDuration(result.getInt(3));
			m.setPrice(result.getDouble(4));
			movielist.add(m);

		}
		return movielist;
	}

	public void insertData(List<Movie> movlist) throws SQLException {
		/*
		 * stat= (PreparedStatement)
		 * con.prepareStatement("insert into movie values (?,?,?,?)"); stat.setInt(1,
		 * ((Movie) moviedata).getMovieid()); stat.setString(2, ((Movie)
		 * moviedata).getMoviename()); stat.setInt(3, ((Movie)
		 * moviedata).getDuration()); stat.setDouble(4, ((Movie) moviedata).getPrice());
		 * int result= stat.executeUpdate(); if(result>0) {
		 * System.out.println("Data inserted"); }
		 */
		
		  con.setAutoCommit(false);
		  stat=con.prepareStatement("insert into movie values(?,?,?,?)");
		  for(Movie m:movlist) {
			 stat.setInt(1,m.getMovieid());
			 stat.setString(2, m.getMoviename());
			 stat.setInt(3,m.getDuration());
			 stat.setDouble(4, m.getPrice());
			 stat.addBatch();
		  }
		int result[]=stat.executeBatch(); 
		if(result[0]>0) {
		  System.out.println("inserted "); }
		con.setAutoCommit(true);
		 
		
	}
	public void deleteData(int id) throws SQLException {
		stat = (PreparedStatement) con.prepareStatement("delete from movie where movieid =?");
		stat.setInt(1, id);
		int result = stat.executeUpdate();
		if(result>0)
		{
			System.out.println("Data deleted");
		}
	}
	public void updateData(double movieprice,int id) throws SQLException {
		stat = (PreparedStatement) con.prepareStatement("update movie set price =? where movieid=?");
		stat.setDouble(1, movieprice);
		stat.setInt(2, id);
		int result = stat.executeUpdate();
		if(result>0)
		{
			System.out.println("Data updated");
		}
	}
	public void totalPrice() throws SQLException {
		stat =(PreparedStatement) con.prepareStatement("select price from movie");
		
		ResultSet res = stat.executeQuery();
		while(res.next()) {
			total= total+res.getDouble(1);
		}
		System.out.println("The total price of all movies are "+ total);
	}
	public void movieDetails(String name) throws Exception {
		stat = (PreparedStatement) con.prepareStatement("select * from movie where moviename =?");
		stat.setString(1,name);
		ResultSet res = stat.executeQuery();
		/*
		 * if(!(res.next()) ){ throw new MovieNotFoundException(); } else {
		 */
			while(res.next()) {
				System.out.println("Movie id is "+res.getInt(1));
				System.out.println("Movie name is "+res.getString(2));
				System.out.println("Movie duration is "+res.getInt(3));
				System.out.println("Movie price is "+res.getDouble(4));
				
				res.next();
				
			}
		}
		
	
	

	public void priceGreater(double price) throws SQLException {
		stat = (PreparedStatement) con.prepareStatement("select * from movie where price>=?");
		stat.setDouble(1, price);
		ResultSet res = stat.executeQuery();
		if(res.next()) {
			
				System.out.println("The Movie name is "+res.getString(1));
				System.out.println("The Movie price is "+res.getDouble(2));

				
			}
		
		}

}
