package dao;
import java.sql.*;
import java.util.*;

import connect.DataConnect;
public class ConcessionMyShop {
	Connection con;
	CallableStatement stat;
	public ConcessionMyShop() {
		con=DataConnect.getConnect();
	}
	public void calculateConcession(String itemid) throws SQLException {
		stat=con.prepareCall("{call Concession_calculate3(?,?)}");
		stat.setString(1, itemid);
		stat.registerOutParameter(2, Types.DOUBLE);
		stat.executeUpdate();
		double concession_price=stat.getDouble(2);
		System.out.println("THe  price after concession is "+concession_price);
	}
}
