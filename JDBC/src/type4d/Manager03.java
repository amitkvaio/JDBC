package type4d;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Manager03
{
	 static String driverClass;
	 static  String url;
	 static String username;
	 static String password;
	
	
	public static void main(String[] args)
	{
		Properties pr = new Properties();
		FileReader fr = null;
		try
		{
			fr = new FileReader("constants.properties");
			pr.load(fr);
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(fr!=null)
				{
					fr.close();
					fr=null;
				}
			} 
			catch (IOException e2)
			{
				e2.printStackTrace();
			}
		}
		driverClass = pr.getProperty("driverClass");
		url = pr.getProperty("url");
		username=pr.getProperty("username");
		password=pr.getProperty("password");
		
		
		try
		{
			Class.forName(driverClass);
		} 
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		Connection con = null;
		Statement stmt = null;
		try
		{
			con = DriverManager.getConnection(url,username,password);
			stmt = con.createStatement();
			String sql = "insert into tab3 values(3,'kakesh')";
			stmt.execute(sql);
			System.out.println("done");
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
}
