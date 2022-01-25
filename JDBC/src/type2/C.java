package type2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class C
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
			String s1 = "select * from tab1";
			rs = stmt.executeQuery(s1);
			
			while(rs.next())
			{
				System.out.print(rs.getInt(1)+" ");
				System.out.print(rs.getString(2)+ " ");
				System.out.print(rs.getString(3) +" ");
				
//				System.out.println(rs.getInt("sno"));
//				System.out.println(rs.getString("fname"));
//				System.out.println(rs.getString("email"));
			}
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
