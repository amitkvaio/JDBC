package type1;

import java.sql.Statement;

public class F
{
	public static void main(String[] args) throws Exception
	{
		Statement stmt = Eutil.getStatement();
		String s1 = "insert into person values(7,'yavac',25)";
		stmt.execute(s1);
		System.out.println("done");
	}
}
