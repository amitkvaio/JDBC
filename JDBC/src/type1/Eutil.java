package type1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Eutil
{
	public static Statement getStatement() throws Exception
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

		Connection con = DriverManager.getConnection("jdbc:odbc:vaio",
				"system", "amit");

		Statement stmt = con.createStatement();

		return stmt;
		
	}

}
