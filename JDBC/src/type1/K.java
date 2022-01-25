package type1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Statement;

public class K
{
	public static void main(String[] args) throws Exception
	{
		Statement stmt = Eutil.getStatement();
		FileReader fr = new FileReader("test3.txt");
		BufferedReader br = new BufferedReader(fr);

		String rows = br.readLine();
		String sql = null;
		String[] cols;
		while (rows != null)

		{
			System.out.println(rows);
			cols = rows.split("\\|");
			sql = "insert into employee values(" + cols[0].trim() + " , '"
					+ cols[1].trim() + "','" + cols[2].trim() + "',"
					+ cols[3].trim() + ")";
			stmt.execute(sql);
			rows = br.readLine();

		}

		System.out.println("done");

	}
}
