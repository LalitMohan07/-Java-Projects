package com.demo.pojo;

public class bankAccount {
		public String accountNumber;
		private String depositorName;
		private String address;
		private String accountType;
		private int balance;
		private int noOfTransactions;
		public String getAccountNumber() {
			return accountNumber;
		}
		public void setAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
		}
		
		
		public String getDepositorName() {
			return depositorName;
		}
		public void setDepositorName(String depositorName) {
			this.depositorName = depositorName;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getAccountType() {
			return accountType;
		}
		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}
		public int getBalance() {
			return balance;
		}
		public void setBalance(int balance) {
			this.balance = balance;
		}
		public int getNoOfTransactions() {
			return noOfTransactions;
		}
		public void setNoOfTransactions(int noOfTransactions) {
			this.noOfTransactions = noOfTransactions;
		}
		
	
}
