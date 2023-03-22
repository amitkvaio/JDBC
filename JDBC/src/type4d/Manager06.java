package type4d;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Manager06 {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		try {
			con = Mutil.getConnection();
			stmt = con.createStatement();
			String s1 = "insert into tab3 values(7,'tech')";
			String s2 = "insert into tab3 values(6,'rekha)";
			stmt.execute(s1);
			stmt.execute(s2);
			System.out.println("done");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Mutil.closeAll(null, stmt, con);

		}
	}
}
/*
	By default setAutoCommit is true due to that each sql query execution
	
	is independent.
	i.e not depending on other sql query.
	if one sql query is written properly then that sql query will be executed successfully.
	if other sql query is  not written properly then that sql query will not be
	executed successfully. 

*/
