package type6;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class Manager13
{
	public static void main(String[] args)
	{
		Connection con = null;
		Statement stmt = null;
		try
		{
			con = DbUtil.getConnection();
			stmt = con.createStatement();
	
			stmt.addBatch("INSERT INTO EMP1(SNO,NAME)VALUES(21,'xyz')");
			stmt.addBatch("INSERT INTO EMP(name)values('pa')");
			stmt.addBatch("update emp1 set name='vaio' where sno=10");
	
			int[] results=stmt.executeBatch();
			System.out.println(Arrays.toString(results));
			System.out.println("DONE");
			
		} catch (SQLException e)
		{
			DbUtil.closeAll(null, stmt, con);
		}
	}
}
