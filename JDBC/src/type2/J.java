package type2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class J
{
	public static void main(String[] args)
	{
		Connection con = null;
		Statement stmt = null;

		try
		{
			con = Eutil.getConnection();
			stmt = con.createStatement();
			String s1 = "create sequence tab2_seq start with 1 increment by 1";
			stmt.execute(s1);
			System.out.println("done");
		} catch (SQLException e)
		{
			e.printStackTrace();
		} finally
		{
			Eutil.closeStatemetn(stmt);
			Eutil.closeConnection(con);
		}
	}
}
