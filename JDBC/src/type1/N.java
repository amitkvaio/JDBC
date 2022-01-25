package type1;

import java.sql.ResultSet;
import java.sql.Statement;

public class N
{
	public static void main(String[] args) throws Exception
	{
		Statement stmt = Eutil.getStatement();
		String s1 = "select * from person";
		ResultSet rs = stmt.executeQuery(s1);
		
		while(rs.next())
		{
			System.out.print(rs.getInt("sno"));
			System.out.print(" " + rs.getString("name"));
			System.out.print(" "+rs.getInt("age"));
			System.out.println("\n");
		}
	}
}
