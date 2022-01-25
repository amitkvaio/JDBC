package me;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class A
{
	public static void main(String[] args) throws SQLException

	{
		try
		{
			Class.forName(QueryUtil.driverClass);
		} catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}

		Connection con = DriverManager.getConnection(QueryUtil.url,QueryUtil.username,QueryUtil.password);
		Statement stmt = con.createStatement(); 
		stmt.execute(QueryUtil.sqlQuery);
		System.out.println("done");

	}
}
