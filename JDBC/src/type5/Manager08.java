package type5;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Manager08
{
	public static void main(String[] args)
	{

		Connection con = null;
		Statement stmt = null;
		try
		{
			con = DbUtil.getConnection();
			stmt = con.createStatement();
			StringBuffer s1 = new StringBuffer();
			s1.append("create or replace procedure p4(arg1 int,arg2 varchar,arg3 int,arg4 int) ");
			s1.append("as begin ");
			//s1.append("insert into tab3 values(arg1,arg2);");
			s1.append("insert into emp values(arg1,arg2,arg3,arg4);");
			s1.append("end;");
			stmt.execute(s1.toString());

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
