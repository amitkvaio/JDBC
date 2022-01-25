package type6;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Manager09
{
	public static void main(String[] args)
	{
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try
		{
			con = DbUtil.getConnection();
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			rs = stmt.executeQuery("select sno,name,age from emp1");
			if (rs.absolute(3))
			{
				rs.updateString("NAME", "ramu");
				rs.updateInt("age", 45);
				rs.updateRow();
			}
		
			rs.beforeFirst();
			System.out.println("After updation of the table");
			while(rs.next())
			{
				System.out.print(rs.getInt(1) + ",");
				System.out.print(rs.getString(2) + ",");
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
