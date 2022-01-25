package type2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class F
{
	public static void main(String[] args) 
	{
		Connection con = null;
		Statement stmt = null;
		
		try
		{
			con = Eutil.getConnection();
			stmt = con.createStatement();
			String s1 = "insert into tab1 values(2,'rakesh','rakesh@gmail.com')";
			stmt.execute(s1);
			System.out.println("done");
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			Eutil.closeStatemetn(stmt);
			Eutil.closeConnection(null);
		}
	}
}
