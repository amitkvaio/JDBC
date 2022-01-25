package type1;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class U
{
	
	public static void main(String[] args)throws Exception
	{
		Statement stmt = Eutil.getStatement();
		
		Scanner sc  = new Scanner(System.in);
		
		ResultSet rs = null;
		String key,sql,decider;
		do
		{
			System.out.println("enter search key");
			key = sc.next();
			sql = "select * from person where name like '%"+key+"%'";
			rs = stmt.executeQuery(sql);
			boolean flag = true;
			
			while(rs.next())
			{
				if(flag)
				{
					flag=false;
				}
				System.out.print(rs.getInt(1));
				System.out.print("  " +rs.getString(2));
				System.out.print("  " +rs.getInt(3));
				System.out.println("\n");
			
			}
			if(flag)
			{
				System.out.println("no result fount ot:" + key);
			}
			
			System.out.println("search again(y\n)?");
			decider= sc.next();
			
		}
		while("y".equals(decider));
		{
			System.out.println("end the game");
		}
	}
}
