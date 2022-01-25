package type7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Manager06
{
	public static void main(String[] args)
	{
		Connection con = null;
		try
		{
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","amit");
		System.out.println(con.toString());
			
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(con!=null)
				{
					con.close();
					con=null;
				}
			} catch (SQLException e2)
			{
				e2.printStackTrace();
			}
		}
	}
}
