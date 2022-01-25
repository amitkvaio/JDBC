package type5;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Manager10
{
	public static void main(String[] args)
	{

		Connection con = null;
		CallableStatement cstmt = null;
		try
		{
			con = DbUtil.getConnection();
			cstmt = con.prepareCall("{call p4(?,?,?,?)}");
			
			cstmt.setInt(1, 1120);
			cstmt.setString(2, "hello");
			cstmt.setInt(3, 90);
			cstmt.setInt(4, 45455);
			cstmt.execute();
			
			
			cstmt.setInt(1, 1121);
			cstmt.setString(2, "vijay");
			cstmt.setInt(3, 40);
			cstmt.setInt(4, 99455);
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
