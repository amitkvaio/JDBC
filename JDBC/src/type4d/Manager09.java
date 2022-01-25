package type4d;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Manager09
{
	public static void main(String[] args)
	{
		Connection con = null;
		PreparedStatement pstmt = null;

		try
		{
			con = Mutil.getConnection();
			pstmt = con.prepareStatement("insert into tab3 values(501,'abc')");
			pstmt.executeUpdate();
			System.out.println("done");
		} catch (SQLException e)
		{
			e.printStackTrace();
		}

		finally
		{
			Mutil.closeAll(null, pstmt, con);
		}
	}
}
