package com.training.day12.synchronization;

public class Thread2  extends Thread{
	private PrintTable pt;
	public Thread2(PrintTable pt) {
		this.pt=pt;
	}
	public void run() {
		pt.print(20);
	}
}
