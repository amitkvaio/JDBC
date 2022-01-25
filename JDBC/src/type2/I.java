package type2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class I
{
	public static void main(String[] args)
	{
		Connection con = null;
		Statement stmt = null;
		 
		try
		{
			con = Eutil.getConnection();
			String s1 = "create table tab2(sno int, name varchar(90), age int)";
			stmt = con.createStatement();
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
			Eutil.closeConnection(con);
		}
	}
	
}
