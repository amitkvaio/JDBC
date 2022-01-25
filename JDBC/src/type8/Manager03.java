package type8;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Manager03
{
	public static void main(String[] args)
	{
		Connection con = null;
		Statement stmt = null;
		try
		{
			con = DbUtil.getConnection();
			stmt = con.createStatement();
			String sql = "insert into student values(3,to_timestamp('21-10-2010 9:34:59','DD-MM-YYYY HH24:MI:SS'),to_date('21-10-2010 9:34:59','DD-MM-YYYY HH24:MI:SS'))";
			stmt.executeUpdate(sql);
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
