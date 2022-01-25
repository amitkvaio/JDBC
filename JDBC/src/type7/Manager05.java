package type7;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Manager05
{
	public static void main(String[] args)
	{
		Connection con = null;
		Statement stmt = null;
		try
		{
			con = DbUtil.getConnection();
			stmt = con.createStatement();
			String s1 = "insert into emp values(200)";
			stmt.executeUpdate(s1);
			System.out.println("done");
			
		} catch (SQLException e)
		{
			for (Throwable th : e)
			{
				System.out.println("ex:"+th);
			}
		} finally
		{
			DbUtil.closeAll(null, stmt, con);
		}
	}
}
