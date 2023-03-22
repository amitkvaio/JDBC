package type4d;

import java.util.*;
import java.sql.*;
import java.io.*;

public class Manager17 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = Mutil.getConnection();
			pstmt = con.prepareStatement("insert into tab3 value(?,?)");
			FileReader fin = null;
			BufferedReader bin = null;
			try {
				fin = new FileReader("data1.txt");
				bin = new BufferedReader(fin);
				String sno, name, line;
				int index;
				line = bin.readLine();
				System.out.println(line);
				while (line != null) {
					index = line.indexOf("-");
					sno = line.substring(0, index);
					name = line.substring(index + 1, line.length());
					pstmt.setInt(1, Integer.parseInt(sno));
					pstmt.setString(2, name);
					pstmt.executeUpdate();
					line = bin.readLine();

				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}

			finally {
				try {
					if (bin != null) {
						bin.close();
						bin = null;
					}
				} catch (IOException ex) {
					ex.printStackTrace();
				}
				try {
					if (fin != null) {
						fin.close();
						fin = null;
					}
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			Mutil.closeAll(null, pstmt, con);
		}
		System.out.println("done");
	}

}
