package type4d;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Manager11 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = Mutil.getConnection();
			pstmt = con.prepareStatement("insert into tab3 values(?,?)");
			pstmt.setInt(1, 701);
			pstmt.setString(2, "hello");
			pstmt.executeUpdate();

			System.out.println("......");

			pstmt.setInt(1, 702);
			pstmt.setString(2, "vijay");
			pstmt.executeUpdate();

			System.out.println("done");

		} catch (SQLException e) {
			e.printStackTrace();
		}

		finally {
			Mutil.closeAll(null, pstmt, con);
		}
	}
}
