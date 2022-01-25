package type1;

import java.sql.ResultSet;
import java.sql.Statement;

public class V
{
	public static void main(String[] args) throws Exception
	{
		String s1 = "select * from person";
		Statement stmt = Eutil.getStatement();
		ResultSet rs = stmt.executeQuery(s1);
		
		while(rs.next())
		{
			System.out.println(rs.getInt("sno"));
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString("sno"));
			System.out.println(rs.getInt(1));
			
		}
	}
}
/*
same row ,same column name we can not read twice 
if we do then it will give sql exception.

*/