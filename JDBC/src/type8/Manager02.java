package type8;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.*;
public class Manager02
{
	public static void main(String[] args)
	{
		Connection con = null;
		PreparedStatement pstmt=null;
		
		try
		{
			con = DbUtil.getConnection();
			pstmt=con.prepareStatement("insert into student values(?,?,?)");
			Date d1 = new Date();
			java.sql.Date d2 = new  java.sql.Date(d1.getTime());
			Timestamp ts=new Timestamp(d1.getTime());		
			pstmt.setInt(1, 2);
			pstmt.setTimestamp(2,ts);
			pstmt.setDate(3,d2);
			pstmt.executeUpdate();
			System.out.println("done");
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			DbUtil.closeAll(null, pstmt, con);
		}
	}
}
