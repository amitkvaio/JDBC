package type1;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Z1
{
	public static void main(String[] args)throws Exception
	{
		Statement stmt = Eutil.getStatement();
		String s1 = "select * from employee";
		ResultSet rs = stmt.executeQuery(s1);
		
		ResultSetMetaData rsmd = rs.getMetaData();
		
		int cols = rsmd.getColumnCount();
		String name, value;
		while(rs.next())
		{
			for(int i = 1 ; i<=cols;i++)
				
			{
				name = rsmd.getColumnName(i);
				value = rs.getString(i);
				System.out.println("name=" + name +":" + " " +"value=" + value);
			}
			System.out.println();
		}
	}
}
