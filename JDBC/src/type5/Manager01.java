package type5;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Manager01 {
	public static void main(String[] args) {

		Connection c1 = null;
		Statement stmt = null;
		try {
			c1 = DbUtil.getConnection();
			stmt = c1.createStatement();
			String s1 = "create table emp(sno int,name varchar(90),age int,salary int)";
			stmt.execute(s1);
			System.out.println("done");
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			DbUtil.closeAll(null, stmt, c1);
		}

	}

}
