package type4d;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

public class Manager01
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","amit");
		
		String sql = "create table tab3(id int ,name varchar(20))";
		
		Statement stmt =con.createStatement();
		
		boolean b1=stmt.execute(sql);
		
		System.out.println("b1="+b1);
		System.out.println("done");
	}
}

/*
 * TYPE 1 DRIVER sun.jdbc.odbc.JdbcOdbcDriver url=
 * ("jdbc:odbc:vaio","systme","amit");
 * 
 * 
 * type 4 driver
 * 
 * driver= oracle.jdbc.driver.OracleDriver
 * 
 * url = "("jdbc:oracle:thin:@localhost:1521:XE","system","amit")";s
 */
