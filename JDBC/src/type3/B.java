package type3;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class B
{
	public static void main(String[] args)
	{
		Connection con = null;
		Statement stmt = null;
		try
		{
			con = Autil.getConnection();
			stmt = con.createStatement();
			String s1 = "insert into tab2 values(tab2_seq.nextval,'xyz',33)";
			int i = stmt.executeUpdate(s1);
			System.out.println(i);
			System.out.println("done");
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			Autil.closeStatement(stmt);
			Autil.closeConnection(con);
		}
	}
}
