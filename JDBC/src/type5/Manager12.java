package type5;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Manager12
{
	public static void main(String[] args)
	{

		Connection con = null;
		CallableStatement cstmt = null;
		try
		{
			con = DbUtil.getConnection();
			cstmt = con.prepareCall("{call p5(?,'abc')}");
			cstmt.setInt(1, 3030);
			cstmt.execute();
			cstmt.setInt(1, 4040);
			cstmt.execute();
			System.out.println("done");
		} catch (SQLException ex)
		{
			ex.printStackTrace();
		} finally
		{
			DbUtil.closeAll(null, cstmt, con);
		}

	}

}
