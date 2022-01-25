package type1;

import java.io.FileReader;
import java.sql.Statement;
import java.util.Properties;
import java.util.Set;

public class J
{
	public static void main(String[] args) throws Exception
	{
		Statement stmt = Eutil.getStatement();
		
		Properties pr = new Properties();
		
		FileReader fin = new FileReader("test2.properties");
		pr.load(fin);
		
		Set<String> keys = pr.stringPropertyNames();
		
		String value;
		for (String st : keys)
		{
			value=pr.getProperty(st);
			stmt.execute(value);
		}
		System.out.println("done");
	}
}
