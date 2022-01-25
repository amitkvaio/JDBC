package type6;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Manager01
{
	public static void main(String[] args)
	{
		Connection con = null;
		Statement stmt = null;

		try 
		{
			con = DbUtil.getConnection();
			stmt = con.createStatement();
			String s1 = "CREATE TABLE EMP1(SNO INT,NAME VARCHAR(90),AGE INT,PIC BLOB,CONSTRAINT EP1 PRIMARY KEY(SNO))";
			stmt.execute(s1);
			String s2 = "INSERT INTO EMP1(SNO,NAME,AGE)VALUES(1,'RAMU',25)";
			String s3 = "INSERT INTO EMP1(SNO,NAME,AGE)VALUES(2,'VIJAY',42)";
			String s4= "INSERT INTO EMP1(SNO,NAME,AGE)VALUES(3,'PAVAN',62)";
			String s5 = "INSERT INTO EMP1(SNO,NAME,AGE)VALUES(4,'MAMU',25)";
			String s6= "INSERT INTO EMP1(SNO,NAME,AGE)VALUES(5,'PRAVEEN',28)";
			String s7 = "INSERT INTO EMP1(SNO,NAME,AGE)VALUES(6,'NAIK',24)";
			stmt.execute(s2);
			stmt.execute(s3);
			stmt.execute(s4);
			stmt.execute(s5);
			stmt.execute(s6);
			stmt.execute(s7);
			System.out.println("DONE");
			System.out.println("done");
			System.out.println("done");
		} catch (SQLException e)
		{
			DbUtil.closeAll(null, stmt, con);
		}
	}
}
