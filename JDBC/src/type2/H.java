package type2;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

public class H
{
	public static void main(String[] args)
	{
		Connection con = null;
		try
		{
			con = Eutil.getConnection();
			DatabaseMetaData dbmd = con.getMetaData();
			System.out.println(dbmd.getDatabaseProductName());
			System.out.println(dbmd.getDriverName());
			System.out.println(dbmd.getDriverVersion());
			System.out.println(dbmd.getDatabaseProductVersion());
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			Eutil.closeConnection(con);
		}
	}
}
