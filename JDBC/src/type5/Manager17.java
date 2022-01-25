package type5;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class Manager17
{	
	public static void main(String[] args)
	{

		Connection con = null;
		CallableStatement cstmt=null;
		
		try
		{
			con = DbUtil.getConnection();
			cstmt=con.prepareCall("{call p7(?,?,?,?)}");
			cstmt.registerOutParameter(1, Types.INTEGER);
			cstmt.registerOutParameter(2, Types.VARCHAR);
			cstmt.registerOutParameter(3, Types.INTEGER);
			cstmt.setInt(4, 1110);
			cstmt.execute();
			System.out.println(cstmt.getInt(1));
			System.out.println(cstmt.getString(2));
			System.out.println(cstmt.getInt(3));
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
