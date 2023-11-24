package com.training.pojo;

public class Librarian {
	private int bookid;
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getWritername() {
		return Writername;
	}
	public void setWritername(String writername) {
		Writername = writername;
	}
	private String bookname;
	private double price;
	private String Writername;
}
