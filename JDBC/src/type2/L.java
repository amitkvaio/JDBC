package type2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class L
{
	public static void main(String[] args) 
	{
		Connection con = null;
		Statement stmt = null;
		try
		{
			con = Eutil.getConnection();
			stmt = con.createStatement();
			FileReader fr = null;
			BufferedReader br = null;
				
				try
				{
					fr = new FileReader("data.txt");
					br = new BufferedReader(fr);
					String s1 = br.readLine();
					String sql = null;
					int status = 0;
					
					while(s1!=null)
					{
						sql = composeSQL(s1);
						System.out.println("status="+status);
						status+=stmt.executeUpdate(sql);
						s1=br.readLine();
					}
					
				} catch (IOException e)
				{
					e.printStackTrace();
				}
				
				finally
				{
					try
					{
						if(br!=null)
						{
							br.close();
							br=null;
						}
					} 
					catch (IOException e2)
					{
						e2.printStackTrace();
					}
					
					
					try
					{
						if(fr!=null)
						{
							fr.close();
							fr=null;
						}
					} 
					catch (IOException e2)
					{
						e2.printStackTrace();
					}
				}
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			Eutil.closeStatemetn(stmt);
			Eutil.closeConnection(con);
		}
		
	}	
	
	private static String composeSQL(String s1)
	{
		int i = s1.indexOf("-");//4
		//ramu-45
		//0123456
		String name = s1.substring(0,i);//i is exclusive i.e ramu
		String age = s1.substring(i+1,s1.length());//5,7
		String sql = "insert into tab2 values(tab2_seq.nextval,'"+name+"',"+age+")";
		return sql;
	}
	
}
