package type6;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Manager03
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
			System.out.println("in forward direction");
			while(rs.next())
			{
				System.out.print(rs.getInt(1)+",");
				System.out.print(rs.getString(2)+",");
				System.out.print(rs.getInt(3));
				System.out.println();
			}
			System.out.println("Cursor is the last position:");
			System.out.println("..................");
			System.out.println("cursor is moves at first position");
			rs.beforeFirst();
			System.out.println("..............");
			System.out.println("in the forware direction again");
			while(rs.next())
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
