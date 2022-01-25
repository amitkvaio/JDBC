package type1;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Z
{
	public static void main(String[] args)throws Exception
	{
		Statement stmt = Eutil.getStatement();
		String s1 = "select * from employee";
		ResultSet rs = stmt.executeQuery(s1);
		ResultSetMetaData rsmd = rs.getMetaData();
		
		int cols = rsmd.getColumnCount();
		System.out.println("tatal number of cols=" + cols);
		while(rs.next())//row wise iteration
		{
			for(int i = 1 ;i<=cols;i++)//column wise iteration
			{
				System.out.print(rs.getString(i)+",");
				
			}
			System.out.println();
		}	
	}
}
