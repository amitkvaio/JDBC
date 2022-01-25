package type1;

import java.sql.Statement;
import java.util.Scanner;

public class H
{
	public static void main(String[] args) throws Exception
	{
		Statement stmt = Eutil.getStatement();
		Scanner sc  = new Scanner(System.in);
		int id,age;
		String fname,lname,sql;
		do
		{
			System.out.println("enter id");
			id = sc.nextInt();
			System.out.println("enter the first name");
			fname = sc.next();
			System.out.println("enter the last name");
			lname = sc.next();
			System.out.println("enter the age");
			age=sc.nextInt();
			
			sql  = "insert into employee values("+id+",'"+fname+"','"+lname+"','"+age+"')";
			stmt.execute(sql);
			
			System.out.println("do you want to insert one more(y/n)?");
			
		}
		while("y".equals(sc.next()));
		System.out.println("done");
		
	}
}
