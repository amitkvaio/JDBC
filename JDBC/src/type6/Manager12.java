package type6;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class Manager12
{
	public static void main(String[] args)
	{
		Connection con = null;
		Statement stmt = null;
		try
		{
			con = DbUtil.getConnection();
			stmt = con.createStatement();
			String s1 = "INSERT INTO EMP1(SNO,NAME,AGE)VALUES(11,'praveen',44)";
			String s2 = "INSERT INTO EMP1(SNO,NAME,AGE)VALUES(12,'pranav',45)";
			String s3 = "UPDATE EMP1 SET NAME='SOMETHING' WHERE SNO=2";
			String s4 = "DELETE FROM EMP1 WHERE SNO=3";
			
			stmt.addBatch(s1);
			stmt.addBatch(s2);
			stmt.addBatch(s3);
			stmt.addBatch(s4);
			
			int[] results=stmt.executeBatch();
			System.out.println(Arrays.toString(results));
			System.out.println("DONE");
			
		} catch (SQLException e)
		{
			DbUtil.closeAll(null, stmt, con);
		}
	}
}
