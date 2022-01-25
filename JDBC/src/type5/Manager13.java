package type5;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Manager13
{
	public static void main(String[] args)
	{
		Connection con = null;
		Statement stmt = null;
		
		try
		{
			con=DbUtil.getConnection();
			stmt = con.createStatement();
			StringBuffer sb = new StringBuffer();
			sb.append("create or replace procedure p6(arg1 OUT varchar)");
			sb.append("as ");
			sb.append("begin ");
			sb.append("select name into arg1 from emp where sno=4040;");
			sb.append("end;");
			stmt.execute(sb.toString());
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
