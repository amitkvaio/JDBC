package type2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Eutil
{
	static
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		} 
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}

	public static Connection getConnection() throws SQLException
	{
		Connection con = DriverManager.getConnection("jdbc:odbc:vaio",
				"system", "amit");
		return con;
	}

	public static void closeResultSet(ResultSet rs)
	{
		try
		{
			if (rs != null)
			{
				rs.close();
				rs = null;
			}
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
	}

	public static void closeConnection(Connection con)
	{
		try
		{
			if (con != null)
			{
				con.close();
				con = null;
			}
		} catch (SQLException e2)
		{
			e2.printStackTrace();
		}
	}

	public static void closeStatemetn(Statement stmt)
	{
		try
		{
			if (stmt != null)
			{
				stmt.close();
				stmt = null;
			}
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
	}

}
