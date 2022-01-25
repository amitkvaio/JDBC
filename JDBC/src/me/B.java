package me;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class B
{
	public static void main(String[] args) throws Exception
	{
		try
		{
			Class c1=Class.forName("oracle.jdbc.driver.OracleDriver");
			c1.newInstance();
		} 
		
		catch (ClassNotFoundException ex)
		{
			System.out.println("Error: unable to load driver class!");

		}
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","amit");
		Statement stmt = con.createStatement();
		String s1 = "create table tab28(sno int,name varchar(90))";
		stmt.execute(s1);
		System.out.println("done");
	}
}
