package type5;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class Manager19
{
	public static void main(String[] args)
	{

		Connection con = null;
		CallableStatement cstmt=null;
		
		try
		{
			con = DbUtil.getConnection();
			cstmt=con.prepareCall("{call p8(?,?)}");
			cstmt.setInt(1, 1110);
			cstmt.setInt(2, 10000);
			cstmt.registerOutParameter(2, Types.INTEGER);
			cstmt.execute();
			System.out.println(cstmt.getInt(2));
			System.out.println("done");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			DbUtil.closeAll(null, cstmt, con);
		}
	}
}
