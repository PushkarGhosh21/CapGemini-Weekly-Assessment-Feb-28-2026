package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcM {

	public static void main(String[] args) 
	{
	    try 
       {
		//1.Checking Driver Class Loaded or not
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2.Establishing the Connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root123");
		
		//3.Create Prepared Statements
		PreparedStatement ps=con.prepareStatement("SELECT * FROM EMPLOYEES");
		
		//4.Execute Queries
		ResultSet rs=ps.executeQuery();
		
		//5.Processing the Result
	    while(rs.next()) 
	     {
            System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getString(3));
         }   
		} 
         
	    catch (Exception e) 
      {
		e.printStackTrace();
	  }

	}

}
