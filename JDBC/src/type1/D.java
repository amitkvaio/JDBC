package type1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class D
{
	public static void main(String[] args) throws Exception
	{
		Class c1 = Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

		Connection con = DriverManager.getConnection("jdbc:odbc:vaio",
				"system", "amit");

		Statement stmt = con.createStatement();

		String s1 = "insert into person values(5,'mandal',25)";
		String s2 = "insert into person values(6,'lara',20)";
		stmt.execute(s1);
		stmt.execute(s2);

		System.out.println("done");

	}
}
