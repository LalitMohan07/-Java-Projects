package com.training.dao;
import java.sql.*;
import java.util.*;

import com.training.connect.DataConnect;
public class MovieProcedureCall {
	private Connection con;
	private CallableStatement stat;
	private Scanner sc;
	public MovieProcedureCall() {
		con=DataConnect.getConnect();
		sc= new Scanner(System.in);
	}
	public void callingProcedure()throws SQLException
	{
		System.out.println("Enter movie id for which u want details ");
		int movieid=sc.nextInt();
		stat=con.prepareCall("{call GetDetailsofMovie(?,?)}");
		stat.setInt(1, movieid);
		stat.registerOutParameter(2, Types.VARCHAR);
		stat.executeUpdate();
		String moviename= stat.getString(2);
		System.out.println("Movie name is "+moviename);
	}
	public static void main(String[] args) {
		MovieProcedureCall mov = new MovieProcedureCall();
		try {
			mov.callingProcedure();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
