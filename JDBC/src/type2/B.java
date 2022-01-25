package type2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class B
{
	public static void main(String[] args)
	{
		try
		{
			Class c1 = Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			
		} 
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		Connection con = null;
		Statement stmt = null;
		
		try
		{
			con  = DriverManager.getConnection("jdbc:odbc:vaio","system","amit");
			stmt = con.createStatement();
			String s1 = "insert into tab1 values(1,'amit','amitku.1990@gmail.com')";
			stmt.execute(s1);
			System.out.println("done");
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(stmt!=null)
				{
					stmt.close();
					stmt = null;
				}
			} 
			catch (SQLException e)
			{
				e.printStackTrace();
			}
			
			
			try
			{
				if(con!=null)
				{
					con.close();
					con=null;
				}
			} 
			catch (SQLException e2)
			{
				e2.printStackTrace();
			}
		}
		
	}
}
