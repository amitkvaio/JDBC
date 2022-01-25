package type8;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Manager00
{
	public static void main(String[] args)
	{
		Connection con = null;
		Statement stmt = null;
		try
		{
			con = DbUtil.getConnection();
			stmt=con.createStatement();
			String s1 = "create table student(sno int,dob timestamp,doj date)";
			stmt.execute(s1);
			System.out.println("done");
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			DbUtil.closeAll(null, stmt, con);
		}
	}
}
