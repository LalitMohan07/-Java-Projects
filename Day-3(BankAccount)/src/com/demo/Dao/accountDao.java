package com.demo.Dao;

import java.util.Scanner;

import com.demo.pojo.bankAccount;


public class accountDao {
	private bankAccount bankc[] ;
	Scanner sc;
	 static int transaction=0;
	public accountDao() {
		sc= new Scanner(System.in);
	}
	public void uniqueAccount() {
		long accountNumber =1000;
		transaction++;
		System.out.println("Enter Total no of Bank Accounts ");
		int totalAccount = sc.nextInt();
		bankc= new bankAccount[totalAccount];
		for(int x=0;x<bankc.length;x++) {
			bankc[x]= new bankAccount();
			bankc[x].setAccountNumber("BA"+Long.toString(accountNumber));
			accountNumber++;
			System.out.println("Enter the Name of depositor");
			bankc[x].setDepositorName(sc.next());
			System.out.println("Enter the Address of depositor");
			bankc[x].setAddress(sc.next());
			System.out.println("Enter the Account type");
			bankc[x].setAccountType(sc.next());
			System.out.println("Enter the Balance in account");
			bankc[x].setBalance(sc.nextInt());
			
		}
	}
	public void display() {
		transaction++;

		for(bankAccount a:bankc) {
			System.out.println("Account Number is "+a.getAccountNumber());
			System.out.println("Depositor name is "+a.getDepositorName());
			System.out.println("Address of depositor "+a.getAddress());
			System.out.println("Account type is "+a.getAccountType());
			System.out.println("The balance remaining is "+a.getBalance());
		}
	}
	
	
	public void addBalance() { 
		transaction++;

	System.out.println("Enter the Account number you want to add funds");
	String acc = sc.next();
	
	int val=0;
		for(int x=0;x<bankc.length;x++) {
			if(acc.equals(bankc[x].getAccountNumber())) {
				System.out.println("Enter the funds you want to add");
				int totalBalance=sc.nextInt();
				val++;
				totalBalance= totalBalance+bankc[x].getBalance();
				 bankc[x].setBalance(totalBalance);
			}
			

			if(val>0) {
				
				System.out.println("The total Balance remaining is "+bankc[x].getBalance());
				
			}
			else {
				System.out.println("Invalid account");
			}
		}
		}
	
	public void removeBalance() {
		transaction++;

		System.out.println("Enter the Account number you want to remove funds");
		String acc = sc.next();
		
		int val=0;
			for(int x=0;x<bankc.length;x++) {
				if(acc.equals(bankc[x].getAccountNumber())) {
					System.out.println("Enter the funds you want to remove");
					int totalBalance=sc.nextInt();
					val++;
					totalBalance= bankc[x].getBalance()-totalBalance;
					 bankc[x].setBalance(totalBalance);
				}
				
				if(val>0) {
					
					System.out.println("The total Balance remaining is "+bankc[x].getBalance());
					
					
				}
				else {
					System.out.println("Invalid account");
				}
				
				

			}
			}
	public void changeAddress() {
		transaction++;

		System.out.println("Enter the Account number you want to change the address ");
		String acc = sc.next();
		int val=0;
		for(int x=0;x<bankc.length;x++) {
			if(acc.equals(bankc[x].getAccountNumber())) {
				val++;
				
				bankc[x].setAddress(sc.next());
				 
			}
			
			if(val>0) {
				
				System.out.println("The new address of "+bankc[x].getAccountNumber()+" is "+bankc[x].getAddress());
			}else {
				System.out.println("Invalid account");
			}
			
			

		}

		
	}
	public void totalTransactions() {
		transaction++;
		if (transaction>0) {
			System.out.println("Total number of Transactions are "+transaction);
		}
	}
		

	}
		

