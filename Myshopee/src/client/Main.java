package client;

import service.MystoreService;

public class Main {
	
	public static void main(String[] args) {
		MainMenu mn = new MainMenu();

	
		
			try {
				mn.Menu();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
}
		

