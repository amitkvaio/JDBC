package type4d;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Manager05
{	
	public static void main(String[] args)
	{
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try
		{
			con = Mutil.getConnection();
			stmt = con.createStatement();
			String s1 = "select * from tab3";
			rs = stmt.executeQuery(s1);
			
			while(rs.next())
			{
				System.out.print(rs.getString(1));
				System.out.print(" " + rs.getString(2));
				System.out.println();
			}
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			Mutil.closeAll(rs, stmt, con);
		}
	}
}
