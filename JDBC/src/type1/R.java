package type1;

import java.sql.ResultSet;
import java.sql.Statement;

public class R
{
	public static void main(String[] args) throws Exception
	{
		Statement stmt = Eutil.getStatement();
		String s1 ="select fname,id,age from employee";
		ResultSet rs = stmt.executeQuery(s1);
		
		while(rs.next())
		{
			System.out.print(rs.getString(1));
			System.out.print(" " + rs.getInt(2));
			System.out.print(" "+ rs.getInt(3));
			System.out.println();
		}
	}
}
