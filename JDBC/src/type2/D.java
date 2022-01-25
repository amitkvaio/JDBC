package type2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class D
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
		ResultSet rs = null;
		
		try
		{
			con  = DriverManager.getConnection("jdbc:odbc:vaio","system","amit");
			stmt = con.createStatement();
			String s1 = "select * from employee";
			rs  = stmt.executeQuery(s1);
			ResultSetMetaData rsmd = rs.getMetaData();
			int cols = rsmd.getColumnCount();
			while(rs.next())
			{
				for(int i = 1 ;i<=cols;i++)
				{
					System.out.print(rs.getString(i)+",");
				}
				System.out.println();
			}
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
		
		finally
		{
			
			try
			{
				if(rs!=null)
				{
					rs.close();
					rs = null;
				}
			} 
			catch (SQLException e)
			{
				e.printStackTrace();
			}
			
			
			
			
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
