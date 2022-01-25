package type1;

import java.sql.ResultSet;
import java.sql.Statement;

public class O
{
	public static void main(String[] args) throws Exception
	{ 
		Statement stmt= Eutil.getStatement();
		
		String s1 = "select * from employee";
		
		ResultSet rs = stmt.executeQuery(s1);
		
		while(rs.next())
		{
			System.out.print(" " + rs.getInt("id"));
			System.out.print(" " + rs.getString("fname"));
			System.out.print(" " + rs.getString("lname"));
			System.out.print(" " + rs.getInt("age"));
			System.out.println();
		}
	}
}
