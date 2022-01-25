package type8;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Manager08
{
	public static void main(String[] args)
	{
		Connection con = null;
		Statement stmt = null;
		try
		{
			con = DbUtil.getConnection();
			stmt = con.createStatement();
			String s1 = "insert into student values(101,sysdate,sysdate)";
			stmt.executeUpdate(s1);
			System.out.println("done");
			
		} catch (SQLException e)
		{
			e.printStackTrace();
		} finally
		{
			DbUtil.closeAll(null, stmt, con);
		}
	}
}
