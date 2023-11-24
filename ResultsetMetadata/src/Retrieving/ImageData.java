package Retrieving;
import java.sql.*;
import java.io.*;

import connect.DataConnect;
public class ImageData {
	private Connection con;
	private PreparedStatement stat;
	public ImageData() {
		con=DataConnect.getConnect();
	}
	public void insert() throws SQLException, IOException {
		stat = con.prepareStatement("insert into employee values(?,?)");
		stat.setString(1, "FirstImage");
		FileInputStream input = new FileInputStream("/home/administrator/Downloads/download.jpeg");
		stat.setBinaryStream(2,input,input.available());
		int result=stat.executeUpdate();
		if(result>0) {
			System.out.println("Data Inserted");
		}
	}
	public void readImage() throws SQLException, IOException {
		 stat=con.prepareStatement("select firstimage from employee where empname=?" );
		 stat.setString(1, "firstimage");
		 ResultSet result =stat.executeQuery();
		 if(result.next()) {
			 Blob imageData = result.getBlob(1);
			 byte arr[]=imageData.getBytes(1,(int) imageData.length());
			 FileOutputStream output = new FileOutputStream("/home/administrator/Downloads/data.jpeg");
			 output.write(arr);
			 System.out.println("output created");
			 
		 }
		 
	}
	public static void main(String[] args) {
		ImageData img = new ImageData();
		try {
			//img.insert();
			img.readImage();
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
