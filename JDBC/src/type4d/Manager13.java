package type4d;

import java.util.*;
import java.sql.*;
import java.io.*;

public class Manager13
{
	public static void main(String[] args)
	{
		Connection con = null;
		PreparedStatement pstmt = null;
		try
		{
			con = Mutil.getConnection();
			pstmt = con
					.prepareStatement("update tab3 set name='naveen' where id=601");
			pstmt.executeQuery();
			System.out.println("done");
		} catch (SQLException ex)
		{
			ex.printStackTrace();
		} finally
		{
			Mutil.closeAll(null, pstmt, con);
		}
	}

}
