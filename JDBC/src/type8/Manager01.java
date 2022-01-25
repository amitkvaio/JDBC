package type8;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

public class Manager01
{
	public static void main(String[] args)
	{
		Connection con = null;
		PreparedStatement pstmt=null;
		
		try
		{
			con = DbUtil.getConnection();
			pstmt=con.prepareStatement("insert into student values(?,?,?)");
			pstmt.setInt(1, 1);
			pstmt.setTimestamp(2, new Timestamp(0));
			pstmt.setDate(3, new Date(0));
			pstmt.executeUpdate();
			System.out.println("done");
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			DbUtil.closeAll(null, pstmt, con);
		}
	}
}

