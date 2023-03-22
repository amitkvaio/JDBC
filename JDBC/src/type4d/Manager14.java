package type4d;

import java.sql.*;
import java.io.*;

public class Manager14 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = Mutil.getConnection();
			pstmt = con.prepareStatement("update tab3 set name=? where id=?");
			pstmt.setString(1, "abc");
			pstmt.setInt(2, 501);
			pstmt.executeUpdate();
			pstmt.setString(1, "xyz");
			pstmt.setInt(2, 701);
			pstmt.executeUpdate();
			System.out.println("done");
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			Mutil.closeAll(null, pstmt, con);
		}
	}

}
