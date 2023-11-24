package com.training.service;

import com.training.dao.Bookdao;

public class Bookservice {
	private Bookdao bdao;
	public Bookservice() {
		bdao=new Bookdao();
	}
	public void InsertBook() {
		bdao.insert();
	}
	public void DeleteBook() {
		bdao.delete();
	}
	public void UpdateBook() {
		bdao.update();
	}
	public void ViewBooks() {
		bdao.view();
	}
	
}
