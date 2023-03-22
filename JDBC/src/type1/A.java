package type1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class A {
	public static void main(String[] args) throws Exception {
		Class c1 = Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

		Connection con = DriverManager.getConnection("jdbc:odbc:vaio", "system", "amit");

		Statement stmt = con.createStatement();

		stmt.execute("create table person(sno int, name varchar(90), age int)");

		System.out.println("done");

	}
}
