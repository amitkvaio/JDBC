package type1;

import java.sql.Statement;

public class L
{
	public static void main(String[] args) throws Exception
	{
		Statement stmt = Eutil.getStatement();
		
		String s1 = "update  person set name='kkkkkkk' where sno =1;";
		System.out.println(s1);
		stmt.execute(s1);
		System.out.println("done");
	}
}
