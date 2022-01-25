package type1;

import java.sql.ResultSet;
import java.sql.Statement;

public class W
{
	public static void main(String[] args)throws Exception
	{
		Statement stmt = Eutil.getStatement();
		String s1 = "select name as firstname from person";
		ResultSet rs = stmt.executeQuery(s1);
		
		while(rs.next())
		{
			//System.out.println(rs.getString("firstname"));
			//System.out.println(rs.getString("name"));//EX
		}
	}
}
