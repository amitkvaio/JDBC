package type6;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class Manager14
{
	public static void main(String[] args)
	{
		Connection con = null;
		Statement stmt = null;
		try
		{
			con = DbUtil.getConnection();
			stmt = con.createStatement();
	
			stmt.addBatch("INSERT INTO EMP1(SNO,NAME)VALUES(22,'btm')");
			stmt.addBatch("INSERT INTO EMP1 VALUES(22,'btm')");
	
			int[] results=stmt.executeBatch();
			System.out.println(Arrays.toString(results));
			System.out.println("DONE");
			
		} catch (SQLException e)
		{
			DbUtil.closeAll(null, stmt, con);
		}
	}
}
/*
2nd query is not proper because
inside the emp1 table there are multiple of column
we are not specify column name that is why we are
getting BathUpdateException.

*/