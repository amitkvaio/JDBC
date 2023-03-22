package type4d;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Mutil {
	private static final String driverClass;
	private static final String url;
	private static final String username;
	private static final String password;

	static {
		FileReader fr = null;
		Properties pr = new Properties();
		try {
			fr = new FileReader("constants.properties");
			pr.load(fr);
		} catch (IOException e) {
			e.printStackTrace();
		}
		driverClass = pr.getProperty("driverClass");
		url = pr.getProperty("url");
		username = pr.getProperty("username");
		password = pr.getProperty("password");
	}

	static {
		try {
			Class.forName(driverClass);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		finally {
			try {
				if (con != null) {
					con.close();
					con = null;
				}
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
	}

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, username, password);
	}

	public static void closeAll(ResultSet rs, Statement stmt, Connection con) {
		try {
			if (rs != null) {
				rs.close();
				rs = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			if (stmt != null) {
				stmt.close();
				stmt = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			if (con != null) {
				con.close();
				con = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
