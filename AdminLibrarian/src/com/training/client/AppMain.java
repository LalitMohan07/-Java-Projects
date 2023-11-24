package com.training.client;

import java.sql.SQLException;

import com.training.menu.Menu;

public class AppMain {
public static void main(String[] args) {
	Menu menu = new Menu();
	try {
		menu.displayMenu();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
