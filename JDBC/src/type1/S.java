package type1;

import java.sql.ResultSet;
import java.sql.Statement;

public class S
{
	public static void main(String[] args) throws Exception
	{
		Statement stmt = Eutil.getStatement();
		String s1 = "select * from person where sno = 5";
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
			System.out.println(rs.getInt(3));
			System.out.println("........");
		}
		if (flag)
		{
			System.out.println("not records available for search:");
		}
	}
}

/*
 * 
 * flag is true then when the control enter into the if block of while loop the
 * flag becomes false in while loop next() return type is boolean if there is
 * any record in the table then it will return true otherwise it will return
 * false. if case of no records in the db rs.next() return false so control will
 * not go inside the while loop it straight way go inside the main if block and
 * print "no records available for search" then public if block will not
 * executed.
 */