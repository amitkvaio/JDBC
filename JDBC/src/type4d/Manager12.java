package type4d;

import java.util.*;
import java.sql.*;
import java.io.*;

public class Manager12
{
	public static void main(String[] args)
	{
		Connection con = null;
		PreparedStatement pstmt = null;
		try
		{
			con = Mutil.getConnection();
			pstmt = con.prepareStatement("insert into tab3 values(?,?)");
			Scanner sc = new Scanner(System.in);
			String sql, sno, name, decider;
			do
			{
				System.out.println("enter no.");
				sno = sc.next();
				pstmt.setInt(1, Integer.parseInt(sno));
				System.out.println("enter name");
				name = sc.next();
				pstmt.setString(2, name);
				pstmt.executeUpdate();
				System.out.println("again print(y/n)?");
				decider = sc.next();
			} while ("y".equals(decider));
		} catch (SQLException ex)
		{
			ex.printStackTrace();
		} finally
		{
			Mutil.closeAll(null, pstmt, con);
		}
	}

}
