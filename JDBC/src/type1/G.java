package type1;

import java.sql.Statement;

public class G
{
	public static void main(String[] args) throws Exception
	{
		Statement stmt = Eutil.getStatement();
		 
		String s1 = "create table employee(id int, fname varchar(90),lname varchar(90),age int)";
		
		stmt.execute(s1);
		
		System.out.println("done");
	}
}
