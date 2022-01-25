package type5;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import type5.DbUtil;

public class Manager15
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
			sb.append("create or replace PROCEDURE p7(ARG1 OUT INT,ARG2 OUT VARCHAR,ARG3 OUT INT,ARG4 IN INT)");
			sb.append("AS ");
			sb.append("BEGIN ");
			sb.append("SELECT age INTO ARG1 FROM emp WHERE sno = ARG4;");
			sb.append("SELECT name INTO ARG2 FROM emp WHERE sno = ARG4;");
			sb.append("SELECT salary INTO ARG3 FROM emp WHERE sno = ARG4;");
			sb.append("END;");
			stmt.execute(sb.toString());
			System.out.println(sb.toString());
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
