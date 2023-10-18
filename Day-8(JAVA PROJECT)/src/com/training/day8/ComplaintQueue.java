package com.training.day8;

import java.util.*;

public class ComplaintQueue {
	Queue<Complaint> complaintqueue;
	Scanner sc;
	public ComplaintQueue(){
		complaintqueue= new LinkedList<>();
		sc= new Scanner(System.in); 
	}
	public void acceptComplaints() {
		System.out.println("Enter the no of complaints u want to have ");
		int noofcomplaint=sc.nextInt();
		for(int x=0;x<noofcomplaint;x++) {
			Complaint c= new Complaint();
			System.out.println("Enter the complaint id ");
			c.setComplaintid(sc.nextInt());
			System.out.println("Enter the Complaint ");
			c.setComplaintMessage(sc.next());
			complaintqueue.add(c);
			
		}
	}
	public void handleComplaint() {
		while(!complaintqueue.isEmpty()) {
			Complaint c = complaintqueue.poll();
			System.out.println("THe complaint id handled is "+c.getComplaintid());
			System.out.println("The complaint message that handled is "+c.getComplaintMessage());
		}
	}
	public static void main(String[] args) {
		ComplaintQueue cmp=new ComplaintQueue();
		cmp.acceptComplaints();
		cmp.handleComplaint();
	}
}
