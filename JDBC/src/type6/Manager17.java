package type6;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import type6.DbUtil;


public class Manager17
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
			
			String sql = "insert into emp1(sno,name)values(105,'abc')";
			stmt.executeUpdate(sql,Statement.RETURN_GENERATED_KEYS);
			rs=stmt.getGeneratedKeys();
			ResultSetMetaData rsmd=rs.getMetaData();
			int cols = rsmd.getColumnCount();
			
			
					System.out.println(rsmd.getColumnName(1));
					System.out.println(rs.getString(1));
				
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
