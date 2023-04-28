package com.sanket;
import java.sql.*;

public class JDBCInsertion {
	public static void main(String[] args)throws Exception {
		String url="jdbc:mysql://localhost:3306/sanketdb";
		String uname ="root";
		String pass = "Mysql@123";
		int studentID = 5;
		String studentName = "Akshay";
		//String query = "insert into students values(4,'Manali')";
		String query = "insert into students values("+studentID+ ",'"+studentName+"')";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		int count = st.executeUpdate(query); // here we use executeUpadte() method bcoz now we are inserting data (DML)		
		System.out.println(count+ "rows affected");
	}

}
