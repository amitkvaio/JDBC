package type5;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Manager06
{
	public static void main(String[] args)
	{

		Connection con = null;
		Statement stmt = null;
		try
		{
			con = DbUtil.getConnection();
			stmt = con.createStatement();
			StringBuffer sb = new StringBuffer();
			sb.append("create or replace procedure p3 ");
			sb.append("as begin ");
			sb.append("insert into tab3 values(202,'abc');");
			sb.append("delete from emp;");

			sb.append("end;");
			stmt.execute(sb.toString());
			System.out.println("done");
		} catch (SQLException ex)
		{
			ex.printStackTrace();
		} finally
		{
			DbUtil.closeAll(null, stmt, con);
		}

	}

}
/*

	we can play with multiple table...

*/