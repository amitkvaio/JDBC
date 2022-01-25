package type1;

import java.sql.Statement;

public class M
{
	public static void main(String[] args) throws Exception
	{
		Statement stmt = Eutil.getStatement();
		
		String s1 = "insert into person values(8,'vaio',56)";
		String s2 = "insert into employee values(10,'sony','vaio',45)";
		String s3 = "update person set name ='lara' where sno=2";
		
		stmt.execute(s1);
		stmt.execute(s2);
		stmt.execute(s3);
		System.out.println("done");
	}
}
