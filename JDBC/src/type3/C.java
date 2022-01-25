package type3;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class C
{
	public static void main(String[] args)
	{
		String sql = "select * from tab2";
		
		Connection con = null;
		
		Statement stmt = null;
		ResultSet rs = null;
		
		try
		{
			con = Autil.getConnection();
			stmt =con.createStatement();
			rs=stmt.executeQuery(sql);
			ResultSetMetaData rsmd=rs.getMetaData();
			int cols = rsmd.getColumnCount();
			
			while(rs.next())
			{
				for (int i = 1; i <=cols; i++)
				{
					System.out.println(rs.getString(i)+",");
				}
				System.out.println();
			}
			
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			Autil.closeResultSet(rs);
			Autil.closeStatement(stmt);
		}
	}
}
