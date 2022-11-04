package org.tnsindia.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//studentDAO contains database

//connection-> eclipse to mysql
public class StudentDAO {

	public Connection createConnection()
	{
		String url="jdbc:mysql://localhost:3306/M25";
		String user="root";
		String password="root";
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Exception Occurred"+e);
		}
		Connection c;
		try {
			c=DriverManager.getConnection(url, user, password);
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			c=null;
			System.out.println("Invalid Credential"+e);
		}
		return c;
	}
}
