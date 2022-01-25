package type8;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Date;

public class Manager06
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
			Date d1 = null;
			java.util.Date d2 = null;
			Timestamp ts = null;
			while (rs.next())
			{
				ts = rs.getTimestamp(2);
				d1 = rs.getDate(3);
				d2 = new Date(ts.getTime());
				System.out.println(d2);
				d2 = new Date(d1.getTime());
				System.out.println(d2);

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
