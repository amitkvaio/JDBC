package type4d;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Manager10 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = Mutil.getConnection();
			String s1 = "insert into tab3 values(601,'abc')";
			pstmt = con.prepareStatement(s1);

			pstmt.executeUpdate();
			System.out.println("----------");
			pstmt.executeUpdate();
			System.out.println("----------");
			pstmt.executeUpdate();
			System.out.println("----------");
			pstmt.executeUpdate();
			System.out.println("----------");

			System.out.println("done");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		finally {
			Mutil.closeAll(null, pstmt, con);
		}
	}
}
