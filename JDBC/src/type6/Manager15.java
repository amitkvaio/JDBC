package type6;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Manager15
{
	public static void main(String[] args)
	{
		Connection con = null;
		PreparedStatement pstmt = null;

		try
		{
			con = DbUtil.getConnection();
			pstmt = con.prepareStatement("insert into emp1(sno,pic)values(?,?)");
			pstmt.setInt(1, 101);
			pstmt.setObject(2, getBytes());
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

	private static byte[] getBytes()
	{
		File f1 = new File("G:\\Image\\Cd\\Beauties\\a.jpg");

		FileInputStream fin = null;
		BufferedInputStream bin = null;
		byte[] b = new byte[(int) f1.length()];

		try
		{
			fin = new FileInputStream(f1);
			bin = new BufferedInputStream(fin);
			bin.read(b);
		} catch (IOException e)
		{
			e.printStackTrace();
		}

		finally
		{
			try
			{
				if (bin != null)
				{
					bin.close();
					bin = null;
				}
			} catch (IOException e2)
			{
				e2.printStackTrace();
			}

			try
			{
				fin.close();
				fin = null;
			} catch (IOException e2)
			{
				e2.printStackTrace();
			}
		}

		return b;

	}
}
