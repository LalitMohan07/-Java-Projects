package com.training.pojo;

public class User {
	private String username;
	private String emailid;
	private String password;
	private String usertype;
	private int supercoins;
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getSupercoins() {
		return supercoins;
	}
	public void setSupercoins(int supercoins) {
		this.supercoins = supercoins;
	}
}
