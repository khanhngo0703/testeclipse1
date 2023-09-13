package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectDB {
	public static Connection openConnection() {
		Connection con = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/projectsem2", "root", "");
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
		} catch (SQLException ex) {
			Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
		}
		return con;

	}

	public static void closeConnection(Connection con, PreparedStatement ps, ResultSet rs) {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException ex) {
				Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
		if (ps != null) {
			try {
				ps.close();
			} catch (SQLException ex) {
				Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException ex) {
				Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
	}
}
