package type6;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Manager16
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
			
			rs=stmt.executeQuery("select pic from emp1 where sno=101");
			
			if(rs.next())
			{
				Blob b1 = rs.getBlob("pic");
				byte[]bytes=b1.getBytes(1, (int)b1.length());
				writeInFile(bytes);
			}
		} catch (SQLException e)
		{
			e.printStackTrace();
		} finally
		{
			DbUtil.closeAll(rs, stmt, con);
		}
		System.out.println("done");
	}
	
	private static void writeInFile(byte[]bytes)
	{
		File f1 = new File("test.jpg");
		FileOutputStream fout = null;
		BufferedOutputStream bout = null;
		
		try
		{
			fout = new FileOutputStream(f1);
			bout = new BufferedOutputStream(fout);
			bout.write(bytes);
			
			
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(bout!=null)
				{
					bout.close();
					bout = null;
				}
			} catch (IOException e2)
			{
				e2.printStackTrace();
			}
			
			try
			{
				if(fout!=null)
				{
					fout.close();
					fout = null;
				}
			} catch (IOException e2)
			{
				e2.printStackTrace();
			}
		}
		
	}
}
