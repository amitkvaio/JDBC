package me;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class F
{
	static
	{
		try
		{
			//Driver driver = (Driver) Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
			DriverManager.registerDriver((Driver) Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance());

		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws SQLException
	{
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:XE", "system", "amit");
		Statement stmt = con.createStatement();
		String s1 = "create table tab24(sno int,name varchar(90))";
		stmt.execute(s1);
		System.out.println("done");
	}
}
