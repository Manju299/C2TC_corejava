package com.tns.jdbcExample;

import java.sql.*;
import java.util.Properties;

public class CreatingTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://127.0.0.1:3306/mydb";
		Properties p = new Properties();
		p.put("user", "root");
		p.put("password","Manju@123");
		
		try {
			Connection con = DriverManager.getConnection(url,p);
			Statement st = con.createStatement();
			String q1 = "Create table employee(empId int primary key,empName varchar(20),empaddress varchar(50))";
			int i = st.executeUpdate(q1);
			System.out.println("Table Created Successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
}
