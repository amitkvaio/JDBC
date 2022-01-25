package type2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class G
{
	public static void main(String[] args)
	{
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try
		{
			con=Eutil.getConnection();
			stmt = con.createStatement();
			String s1 = "select * from person";
			rs = stmt.executeQuery(s1);
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getInt(3));
			}
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			Eutil.closeResultSet(rs);
			Eutil.closeStatemetn(stmt);
			Eutil.closeConnection(con);
			
		}
		
	}
}
