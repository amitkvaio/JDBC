package type4d;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Manager02
{
	public static void main(String[] args)
	{
		try
		{	Driver driver = new oracle.jdbc.driver.OracleDriver();
			DriverManager.registerDriver(driver);
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		Connection con = null;
		Statement stmt = null;
		try
		{
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","amit");
			stmt = con.createStatement();
			String sql  = "insert into tab3 values(1,'amit')";
			stmt.execute(sql);
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
			catch (SQLException e2)
			{
				e2.printStackTrace();
			}
			
			try
			{
				if(con!=null)
				{
					con.close();
					con = null;
				}
			} 
			catch (SQLException e2)
			{
				e2.printStackTrace();
			}
		}
	}
}
