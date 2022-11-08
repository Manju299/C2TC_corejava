package com.tns.jdbcExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ResultOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		String url = "jdbc:mysql://127.0.0.1:3306/mydb";
		Connection con;
		try {
			con = DriverManager.getConnection(url,"root","Manju@123");
			Statement st = con.createStatement();
			// String q = "insert into employee values(1,'Manjunath','Bangalore')";
			// int res = st.executeUpdate(q);
			// System.out.println(res + "affected");
			String q1 = "Select * from Employee";
			ResultSet rs = st.executeQuery(q1);
			ResultSetMetaData rsmt =  rs.getMetaData();
			System.out.println(rsmt);
			int cols = rsmt.getColumnCount();
			while(rs.next()) 
				for (int i=1;i<=cols;i++)
				System.out.print(rs.getString(i) + " \t ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		

	}


