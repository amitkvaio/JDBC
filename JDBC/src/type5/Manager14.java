package type5;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class Manager14
{
	public static void main(String[] args)
	{
		Connection con = null;
		CallableStatement cstmt = null;
		
		try
		{
			con=DbUtil.getConnection();
			cstmt = con.prepareCall("{call p6(?)}");
			cstmt.registerOutParameter(1, Types.VARCHAR);
			cstmt.execute();
			String s1 =cstmt.getString(1);
			System.out.println(s1);
			System.out.println("done");
			
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			DbUtil.closeAll(null, cstmt, con);
		}
	}
}
