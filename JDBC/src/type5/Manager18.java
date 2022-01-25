package type5;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class Manager18
{
	public static void main(String[] args)
	{

		Connection con = null;
		Statement stmt = null;

		try
		{
			con = DbUtil.getConnection();
			stmt = con.createStatement();
			String s1 = "create or replace PROCEDURE P8(ARG1 INT, "
					+ " ARG2 IN OUT INT) " + " AS BEGIN "
					+ " UPDATE EMP SET SALARY=SALARY+ARG2 WHERE SNO=ARG1; "
					+ "SELECT salary INTO ARG2 FROM emp WHERE sno = ARG1;"
					+ " END;";

			stmt.execute(s1);
			System.out.println("done");
		} catch (SQLException e)
		{
			e.printStackTrace();
		} finally
		{
			DbUtil.closeAll(null, stmt, con);
		}
	}
}
