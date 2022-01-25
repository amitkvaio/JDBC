package type5;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Manager11

{
	public static void main(String[] args)
	{

		Connection con = null;
		Statement stmt = null;
		try
		{
			con = DbUtil.getConnection();
			stmt = con.createStatement();
			StringBuffer s1 = new StringBuffer();
			s1.append("create or replace procedure p5(sno int,name varchar) ");
			s1.append("as begin ");
			//s1.append("insert into tab3 values(sno,name);");
			s1.append("insert into emp values(sno,name,44,898989);");
			s1.append("end;");
			stmt.execute(s1.toString());
			System.out.println("done");
		} 
		catch (SQLException ex)
		{
			ex.printStackTrace();
		} 
		finally
		{
			DbUtil.closeAll(null, stmt, con);
		}

	}

}
