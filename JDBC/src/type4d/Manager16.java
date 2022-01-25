package type4d;

import java.util.*;
import java.sql.*;
import java.io.*;

public class Manager16
{
	public static void main(String[] args)
	{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			con = Mutil.getConnection();
			pstmt = con.prepareStatement("select * from tab3 where id>?");
			pstmt.setInt(1, 102);
			rs = pstmt.executeQuery();
			while (rs.next())
			{
				System.out.println(rs.getInt(1) + " ");
				System.out.println(rs.getString(2) + " ");
			}
		} catch (SQLException ex)
		{
			ex.printStackTrace();
		} finally
		{
			Mutil.closeAll(null, pstmt, con);
		}
	}

}
