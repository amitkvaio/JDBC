package type4d;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Manager08
{
	public static void main(String[] args)
	{
		Connection con = null;
		Statement stmt = null;
		String sql, decider;
		
		try
		{
			con = Mutil.getConnection();
			stmt = con.createStatement();
			
			do
			{
				Scanner sc  = new Scanner(System.in);
				System.out.println("enter the serial number:");
				String no = sc.next();
				System.out.println("enter the name:");
				String name = sc.next();
				
				sql = "insert into tab3 values("+no+",'"+name+"')";
				stmt.executeUpdate(sql);
				System.out.println("you want to insert one more data:(y\n)");
				decider = sc.next();
			}
			while("y".equalsIgnoreCase(decider));
			System.out.println("game is over:");
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			Mutil.closeAll(null, stmt, con);
		}
	}
}
