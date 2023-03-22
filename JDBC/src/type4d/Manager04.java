package type4d;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Manager04 {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;

		try {
			con = Mutil.getConnection();
			stmt = con.createStatement();
			String s1 = "insert into tab3 values(4,'lara')";
			String s2 = "insert into tab3 values(5,'tech')";
			stmt.executeUpdate(s1);
			stmt.executeUpdate(s2);
			System.out.println("done");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Mutil.closeAll(null, stmt, con);
		}
	}
}
