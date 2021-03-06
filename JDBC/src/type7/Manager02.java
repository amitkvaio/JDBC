package type7;

import java.sql.Connection;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Manager02
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
			String s1 = "insert into employee(sno,name,age)values(300,'raja',22)";
			stmt.executeUpdate(s1, Statement.RETURN_GENERATED_KEYS);
			rs = stmt.getGeneratedKeys();
			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println("...........");
			int cols = rsmd.getColumnCount();
			while (rs.next())
			{
				for (int i = 1; i <= cols; i++)
				{
					System.out.println(rsmd.getColumnName(i));
					System.out.println(rs.getString(i));
				}
			}

			System.out.println("done");

		} catch (SQLException e)
		{
			e.printStackTrace();
		} finally
		{
			DbUtil.closeAll(null, stmt, con);
		}
	}
}
