package com.training.dao;
import java.sql.*;
import java.util.*;

import com.training.connect.DataConnect;
import com.training.pojo.Librarian;
public class Librariandao {
	Connection con;
	PreparedStatement stat;
	Scanner sc;
	List<Librarian> liblist;
	public Librariandao() {
		con=DataConnect.getConnect();
		sc=new Scanner(System.in);
		liblist=new ArrayList<Librarian>();
	}
	public void insertBook() throws SQLException {
		System.out.println("Enter the no of books u want to insert");
		int noofbook =sc.nextInt();
		stat=con.prepareStatement("insert into Librarian values(?,?,?,?)");
		for(int x=1;x<=noofbook;x++) {
			System.out.println("Enter the book id ");
			stat.setInt(1, sc.nextInt());
			System.out.println("Enter the book name");
			stat.setString(2, sc.next());
			System.out.println("Enter the price of the book");
			stat.setDouble(3, sc.nextDouble());
			System.out.println("Enter the Writers name");
			stat.setString(4, sc.next());
			int res=stat.executeUpdate();
			if(res>0) {
				System.out.println("Data inserted");
			}
		}
	}
	public void viewBook() throws SQLException {
		stat=con.prepareStatement("select * from Librarian");
		ResultSet res= stat.executeQuery();
		while(res.next()) {
			System.out.println("The Book Name is "+res.getString(2));
			System.out.println("The Price of the book is "+res.getDouble(3));
			System.out.println("The Writers Name is "+res.getString(4));

		}
	}
	public List<Librarian> issueBook() throws SQLException {
		System.out.println("Enter the no of books u want to isssue");
		int noofbook=sc.nextInt();
		for(int x=1;x<=noofbook;x++) {
			Librarian lib = new Librarian();
			System.out.println("enter the book id u want to issue");
			int id=sc.nextInt();
			stat=con.prepareStatement("select * from Librarian where book_id=?");
			stat.setInt(1, id);
			ResultSet res= stat.executeQuery();
			while(res.next()) {
				lib.setBookid(res.getInt(1));
				lib.setBookname(res.getString(2));
				lib.setPrice(res.getDouble(3));
				lib.setWritername(res.getString(4));
				liblist.add(lib);
				
			}
			System.out.println("Books issued");
		}
		return liblist;
		
	}
	public void viewIssuedBooks() throws SQLException {
		//Librariandao ldao = new Librariandao();
		//List<Librarian> llist=ldao.isuueBook();
		for(Librarian l:liblist) {
			System.out.println("The Book name is " +l.getBookname());
			System.out.println("The Book price is " +l.getPrice());
			System.out.println("The Books Writer name is " +l.getWritername());

		}
	}
	public void returnBooks() throws SQLException {
		System.out.println("Enter the book id u want to return");
		int returnbook = sc.nextInt();
		
		for(Librarian l:liblist) {
			if(l.getBookid()==returnbook) {
				System.out.println("The book returned is "+l.getBookname());
				liblist.remove(l);
			}
		}

	}
}
