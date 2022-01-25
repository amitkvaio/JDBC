package type4d;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Manager07
{
	public static void main(String[] args)
	{
		Connection con = null;
		Statement stmt = null;
		try
		{
			con = Mutil.getConnection();
			stmt  = con.createStatement();
			
			String s1 = "insert into tab3 values(12,'tweleve')";
			String s2  ="insert into tab3  values(7,'vijay)";
			con.setAutoCommit(false);
			stmt.executeUpdate(s1);
			System.out.println("one query done");
			stmt.executeUpdate(s2);
			System.out.println("2nd query done");
			con.commit();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
			try
			{
				con.rollback();
				
			} catch (SQLException e2)
			{
				e2.printStackTrace();
			}
		}
		finally
		{
			Mutil.closeAll(null, stmt, con);
		}
	}
}
/*
	Here setAutoCommit is false, due to that each sql query is depending on other sql
	queries.
	i.e if any sql query is not executed properly then no sql query query will be executed.
	in this case the transaction will be roll back at its initial stage.

*/
