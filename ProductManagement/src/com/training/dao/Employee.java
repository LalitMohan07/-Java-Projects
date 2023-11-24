package com.training.dao;
import java.sql.*;
import java.util.Scanner;

import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import com.training.connect.DataConnect;
public class Employee {
	Connection con;
	PreparedStatement stat;
	CallableStatement stm;
	Scanner sc;
	public Employee() {
		con=DataConnect.getConnect();
		sc= new Scanner(System.in);
	}
	public void insertDeptData() {
		System.out.println("Enter the no of department u want to have ");
		int noofdept = sc.nextInt();
		try {
			stat=con.prepareStatement("insert into Department values (?,?,?,?)");
			for(int x=1;x<=noofdept;x++) {
				System.out.println("Enter the department id  ");
				stat.setInt(1,sc.nextInt());
				System.out.println("Enter the department name ");
				stat.setString(2, sc.next());
				System.out.println("Enter the department head ");
				stat.setString(3, sc.next());
				System.out.println("Enter the department description");
				stat.setString(4, sc.next());
				int result = stat.executeUpdate();
				if(result>0) {
					System.out.println("Department details inserted successfully");
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void insertEmpData() {
		System.out.println("Enter the no of Employees u want to have ");
		int noofemp = sc.nextInt();
		try {
			stat=con.prepareStatement("insert into Employee values (?,?,?,?,?,?)");
			for(int x=1;x<=noofemp;x++) {
				System.out.println("Enter the employee id  ");
				stat.setInt(1,sc.nextInt());
				System.out.println("Enter the employee name ");
				stat.setString(2, sc.next());
				System.out.println("Enter the employee address ");
				stat.setString(3, sc.next());
				System.out.println("Enter the employee salary");
				stat.setDouble(4, sc.nextDouble());
				System.out.println("Enter the employee contact no");
				stat.setString(5, sc.next());
				System.out.println("Enter the department id");
				stat.setInt(6, sc.nextInt());
				int result = stat.executeUpdate();
				if(result>0) {
					System.out.println("Employee details inserted successfully");
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void retriveEmployeeDetails(int empid) {
		try {
			
			stat=con.prepareStatement("select e.employee_id,e.employee_name,e.employee_contact_no,e.employee_address,d.department_name,d.department_head from Employee e join Department d on e.department_id=d.department_id where e.employee_id=?");
			stat.setInt(1, empid);
			ResultSet result = stat.executeQuery();
			while(result.next()){
				System.out.println("Employee id is "+result.getInt(1));
				System.out.println("Employee name is  "+result.getString(2));
				System.out.println("Employee contact no is "+result.getString(3));
				System.out.println("Employee address is "+result.getString(4));
				System.out.println("Department name is "+result.getString(5));
				System.out.println("Department head is "+result.getString(6));
				
	
	
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void calculatepf(int employeeid) throws SQLException {
		stm=con.prepareCall("{call Callpf(?,?)}");
		stm.setInt(1, employeeid);
		stm.registerOutParameter(2,Types.DOUBLE);
		stm.executeUpdate();
		double pf = stm.getDouble(2);
		System.out.println("The pf amount is "+pf);
	}
	
	public static void main(String[] args) throws SQLException {
		Employee emp = new Employee();
		//emp.insertDeptData();
		//emp.insertEmpData();
		//emp.retriveEmployeeDetails(2);
		emp.calculatepf(2);
	}
	
}
