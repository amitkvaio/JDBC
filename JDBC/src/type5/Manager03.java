package type5;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Manager03
{
	public static void main(String[] args)
	{
		Connection con = null;
		CallableStatement cstmt = null;
		
		try
		{
			con = DbUtil.getConnection();
			cstmt = con.prepareCall("{call p1}");
			cstmt.execute();
			System.out.println("done");
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			DbUtil.closeAll(null, cstmt, con);
		}
	}
}

/*

prepareCall(----) method is used to call the compiled stored procedure.
its gives the more performance because sql queries is already compiled.
*/