package type1;

import java.sql.ResultSet;
import java.sql.Statement;

public class Q
{
	public static void main(String[] args) throws Exception
	{
		Statement stmt = Eutil.getStatement();
		String s1 = "select * from employee";
		ResultSet rs = stmt.executeQuery(s1);
		
		while(rs.next())
		{
			System.out.print(rs.getInt(1));
			System.out.print(" "+ rs.getString("fname"));
			System.out.print(" "+ rs.getString(3));
			System.out.println(" "+ rs.getInt("age"));
			System.out.println("....................");
			
		}
	}
}
