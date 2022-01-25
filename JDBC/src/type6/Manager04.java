package type6;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Manager04
{
	public static void main(String[] args)
	{
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try
		{
			con = DbUtil.getConnection();
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			rs=stmt.executeQuery("select * from emp1");
			System.out.println("reading in the reverse");
			rs.afterLast();
			while(rs.previous())
			{
				System.out.print(rs.getInt(1)+",");
				System.out.print(rs.getString(2)+",");
				System.out.print(rs.getInt(3));
				System.out.println();
			}
			System.out.println("..............");
			System.out.println("again reading in the reverse direction");
			rs.afterLast();
			while(rs.previous())
			{
				System.out.print(rs.getInt(1)+",");
				System.out.print(rs.getString(2)+",");
				System.out.print(rs.getInt(3));
				System.out.println();
			}
			
			System.out.println("DONE");
		} catch (SQLException e)
		{
			DbUtil.closeAll(null, stmt, con);
		}
	}
}
