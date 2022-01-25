package type1;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Y
{
	public static void main(String[] args) throws Exception
	{
		Statement stmt = Eutil.getStatement();

		String s1 = "select id,fname,lname,age from employee";

		ResultSet rs = stmt.executeQuery(s1);

		ResultSetMetaData rsmd = rs.getMetaData();

		int cols = rsmd.getColumnCount();
		for (int i = 1; i <= cols; i++)
		{
			System.out.println(rsmd.getColumnClassName(i));
			System.out.println(rsmd.getColumnName(i));
			System.out.println(rsmd.getColumnDisplaySize(i));
		}
		System.out.println("cols=" + cols);
	}
}
