package type1;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class X
{
	public static void main(String[] args) throws Exception
	{
		Statement stmt = Eutil.getStatement();
		String s1 = "select * from employee";
		ResultSet rs = stmt.executeQuery(s1);

		ResultSetMetaData rsmd = rs.getMetaData();

		int cols = rsmd.getColumnCount();
		String c1 = rsmd.getColumnName(1);
		String c2 = rsmd.getColumnName(2);
		String c3 = rsmd.getColumnName(3);
		String c4 = rsmd.getColumnName(4);

		System.out.println("cols=" + cols);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
	}
}

/*
 * 
 * An object that can be used to get information about the types and properties
 * of the columns in a ResultSet object. The following code fragment creates the
 * ResultSet object rs, creates the ResultSetMetaData object rsmd, and uses rsmd
 * to find out how many columns rs has and whether the first column in rs can be
 * used in a WHERE clause.
 * 
 * 
 * ResultSet rs = stmt.executeQuery("SELECT a, b, c FROM TABLE2");
 * ResultSetMetaData rsmd = rs.getMetaData(); int numberOfColumns
 * =rsmd.getColumnCount(); boolean b = rsmd.isSearchable(1);
 */
