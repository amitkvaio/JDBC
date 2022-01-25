package type7;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Manager04
{
	public static void main(String[] args)
	{
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try
		{
			con = DbUtil.getConnection();
			stmt = con.createStatement();
			String s1 = "insert into emp(sno,name)values(1,'raja')";
			stmt.executeUpdate(s1, Statement.RETURN_GENERATED_KEYS);
			rs = stmt.getGeneratedKeys();
			System.out.println(rs);
			String rowid = null;
			if(rs.next())
			{
				rowid=rs.getString(1);
			}
			
			System.out.println(rowid);
			String s2="update emp set r_id='"+rowid+"' where sno=1";
			stmt.executeUpdate(s2);
			System.out.println("done");
			
		} catch (SQLException e)
		{
			e.printStackTrace();
		} finally
		{
			DbUtil.closeAll(rs, stmt, con);
		}
	}
}
