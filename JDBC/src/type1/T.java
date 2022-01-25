package type1;

import java.sql.ResultSet;
import java.sql.Statement;

public class T
{
	public static void main(String[] args) throws Exception
	{
		Statement stmt = Eutil.getStatement();
		String s1 = "select * from employee where fname like '%an%'";
		ResultSet rs = stmt.executeQuery(s1);
		boolean flag = true;

		while (rs.next())
		{
			if (flag)
			{
				flag = false;
			}
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getInt(4));
			System.out.println("...........");
		}
	}
}
/*
 * %an%=an any where in the fname of employee table
 */