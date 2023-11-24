package com.training.main;

import java.sql.SQLException;

import com.training.menu.Menu;

public class AppMain extends Thread {
	public void run() {
		Menu mn = new Menu();
		try {
			mn.displayMenu();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		AppMain app = new AppMain();
		app.run();
		
	}
}
