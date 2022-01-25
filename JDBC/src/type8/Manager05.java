package type8;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Date;

public class Manager05
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
			rs = stmt.executeQuery("select * from student");
			Date date = null;
			Timestamp ts = null;
			int i;
			while (rs.next())
			{
				i = rs.getInt(1);
				ts = rs.getTimestamp(2);
				date = rs.getDate(3);
				System.out.println(i);
				System.out.println(ts);
				System.out.println(date);
				System.out.println(".........");
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
