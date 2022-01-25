package type1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Statement;

public class I
{
	public static void main(String[] args) throws Exception
	{
		Statement stmt = Eutil.getStatement();
		FileReader f1 = new FileReader("test1.txt");
		BufferedReader br = new BufferedReader(f1);
		
		String sql= null;
		String row= br.readLine();
		
		String[] cols;
		while(row!=null)
		{
			cols = row.split(",");
			sql = "insert into employee values("+cols[0].trim()+", '"+cols[1].trim()+"','"+cols[2].trim()+"','"+cols[3].trim()+"')";
			stmt.execute(sql);
			System.out.println(row);
			row = br.readLine();
			
			
		}
		System.out.println("done");
	}
}
