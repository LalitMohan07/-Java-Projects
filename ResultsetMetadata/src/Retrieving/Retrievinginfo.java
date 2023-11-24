package Retrieving;
import java.sql.*;

import connect.DataConnect;
public class Retrievinginfo {
	private PreparedStatement stat;
	private Connection con;
	public Retrievinginfo() {
		con=DataConnect.getConnect();
	}
	public void retrieveData() throws SQLException {
		stat=con.prepareStatement("select * from movie");
		ResultSet result = stat.executeQuery();
		while(result.next()) {
			System.out.println("Movie id is "+result.getInt(1));
			System.out.println("Movie name is "+result.getString(2));

		}
		ResultSetMetaData resultMeta = result.getMetaData();
		System.out.println("Column name of first column is "+resultMeta.getColumnName(1));
		System.out.println("Total Column returned in resultset is "+resultMeta.getColumnCount());
		System.out.println("Datatype of second column is "+resultMeta.getColumnTypeName(2));

	}
	public void database() throws SQLException {
		DatabaseMetaData dbmeta = con.getMetaData();
		boolean bool = dbmeta.supportsBatchUpdates();
		if(bool) {
			System.out.println("Underlying database supports batch updates");
			
		}
		else{
			System.out.println("Underlying database does not supports batch updates");

		}
		System.out.println(dbmeta.getDriverName());
		System.out.println(dbmeta.getUserName());
	}
	public static void main(String[] args) {
		Retrievinginfo ret = new Retrievinginfo();
		try {
			//ret.retrieveData();
			ret.database();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
