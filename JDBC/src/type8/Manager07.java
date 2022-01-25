package type8;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Date;

public class Manager07
{
	public static void main(String[] args)
	{
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try
		{
			con = DbUtil.getConnection();
			stmt = con.createStatement();
			String s1 = "select TO_CHAR(dob,'DD-MON-YYYY HH24:MI:SS') as date_birth,TO_CHAR(doj,'DD-MON-YYYY HH24:MI:SS')as date_join from student";
			rs = stmt.executeQuery(s1);
			while (rs.next())
			{
				System.out.println(rs.getString("date_birth"));
				System.out.println(rs.getString("date_join"));
				System.out.println("...........");

			}

			System.out.println("done");

		} catch (SQLException e)
		{
			e.printStackTrace();
		} finally
		{
			DbUtil.closeAll(rs, stmt, con);
		}
	}
}
