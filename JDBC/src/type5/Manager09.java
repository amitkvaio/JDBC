package type5;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Manager09
{
	public static void main(String[] args)
	{

		Connection con = null;
		CallableStatement cstmt = null;
		try
		{
			con = DbUtil.getConnection();
			cstmt = con.prepareCall("{call p4(1110,'xyz',22,85000)}");
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
