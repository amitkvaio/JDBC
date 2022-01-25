package type1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class B
{
	public static void main(String[] args) throws Exception
	{
		Class c1 = Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		
		Connection con = DriverManager.getConnection("jdbc:odbc:vaio",
				"system", "amit");
		
		Statement stmt = con.createStatement();
		
		stmt.execute("insert into person values(1,'amit',22)");
		
		System.out.println("done");

	}
}
