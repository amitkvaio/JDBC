package type4d;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Amit {
	public static void main(String[] args) throws Exception {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "system");

		Statement stmt = con.createStatement();

		String sql = "create table lara(id int,name varchar(20))";

		boolean b1 = stmt.execute(sql);
		System.out.println(b1);

		System.out.println("done");
	}
}
