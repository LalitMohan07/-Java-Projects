package com.training.day12.synchronization;

public class Thread1 extends Thread{
	private PrintTable pt;
	public Thread1(PrintTable pt) {
		this.pt=pt;
	}
	public void run() {
		pt.print(10);
	}
}
