package com.tns.jdbcExample;
// import the package
import java.sql.*;
import javax.sql.*;

public class DatabaseCon {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://127.0.0.1:3306/mydb";
		//Inserting value in student table 
		//String query = "insert into student values(2,'kumar')";
		try {
			Connection con = DriverManager.getConnection(url,"root","Manju@123");
			Statement st = con.createStatement();
			//int count = st.executeUpdate(query);
			//System.out.println(count+" rows affected");
			String query2 = "Select * from student";
			
			
			ResultSet rs = st.executeQuery(query2);
			// Prints all the data present in colomn 1 and 2
			while(rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2));
			}
			st.close();
		} catch (SQLException e) {
			// e.printStackTrace();
			//
			System.out.println("Not Connected,Please check connectivity");
		}

	}

}
