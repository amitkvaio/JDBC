package type1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class C
{
	public static void main(String[] args) throws Exception
	{
		Class c1 = Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

		Connection con = DriverManager.getConnection("jdbc:odbc:vaio",
				"system", "amit");

		Statement stmt = con.createStatement();

		stmt.execute("insert into person values(2,'gourav',25)");
		stmt.execute("insert into person values(3,'rakesh',26)");
		stmt.execute("insert into person values(4,'poonam',18)");

		System.out.println("done");

	}
}
