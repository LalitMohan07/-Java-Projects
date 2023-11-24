package com.training.client;

import java.sql.SQLException;

public class Main {
 public static void main(String[] args) {
	MovieMenu men = new MovieMenu();
	try {
		men.Menu();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
