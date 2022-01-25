package type7;

import java.sql.Connection;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Manager01
{
	public static void main(String[] args)
	{
		Connection con = null;
		PreparedStatement pstmt = null;

		try
		{
			con = DbUtil.getConnection();
			pstmt = con
					.prepareStatement("insert into employee(sno,name,age) values(?,?,?)");
			ParameterMetaData pmd = pstmt.getParameterMetaData();
			pstmt.setInt(1, 2000);
			pstmt.setString(2, "amit");
			pstmt.setInt(3, 78);
			System.out.println("...........");
			int count = pmd.getParameterCount();
			System.out.println(count);
			pstmt.executeUpdate();
			System.out.println("done");

		} catch (SQLException e)
		{
			e.printStackTrace();
		} finally
		{
			DbUtil.closeAll(null, pstmt, con);
		}
	}
}
