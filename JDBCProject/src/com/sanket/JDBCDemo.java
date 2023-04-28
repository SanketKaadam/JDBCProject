package com.sanket;

import java.sql.*;

public class JDBCDemo {

	public static void main(String[] args) throws Exception
	{
		String url="jdbc:mysql://localhost:3306/sanketdb";
		String uname="root";
		String pass = "Mysql@123";
		String query = "select studentName from students where studentID = 3";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		String name = rs.getString("studentName");
		System.out.println(name);
		rs.close();
		st.close();
		
	}

}
