package com.sanket;
import java.sql.*;

public class JDBCPreparedStatement {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/sanketdb";
		String uname = "root";
		String pass = "Mysql@123";
		int studentID=6;
		String studentName="Vijay";
		String query= "insert into students values(?,?)";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		// Statement st = con.createStatement(); bcoz we are using PreparedStatement
		PreparedStatement pr = con.prepareStatement(query);
		pr.setInt(1, studentID);
		pr.setString(2, studentName);
		int count= pr.executeUpdate(); // here we don't pass query bcoz in above we alredy passed
		System.out.println(count+ " rows affected");
		pr.close();
		con.close();
		
	}

}
