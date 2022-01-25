package type5;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Manager04
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
			sb.append("create or replace procedure p2 ");
			sb.append("as begin ");
			sb.append("insert into emp values(5,'ramu',22,55000);");
			sb.append("update emp set name='aaaa' where sno=2;");
			sb.append("delete from emp where sno=3;");

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
	multiple operation we can perform at the same time through the
	stored procedure.

*/
