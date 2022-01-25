package type2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class K
{
	public static void main(String[] args)
	{
		Connection con = null;
		Statement stmt = null;
		 
		try
		{
			con = Eutil.getConnection();
			stmt = con.createStatement();
			String s1 = "insert into tab2 values(tab2_seq.nextval,'amit',24)";
			int status = stmt.executeUpdate(s1);
			System.out.println(status);
			System.out.println("done");
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			Eutil.closeStatemetn(stmt);
			Eutil.closeConnection(con);
		}
	}
}
