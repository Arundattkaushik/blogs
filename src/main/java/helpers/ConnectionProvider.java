package helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

	private static String url ="jdbc:mysql://localhost:3306/techblog";
	public static Boolean connectionStatus = false;
	private static Connection conn;
	public static Connection getConnection() {
		if (conn==null) {
			//Load drivers in the memory
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} 
			catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			//Create a connection
			try {
				conn = DriverManager.getConnection(url, "root","");
				connectionStatus = true;
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return conn;
	}
	
	public static void closeConnection() {
		try {
			if(conn!=null) {
			conn.close();
			connectionStatus = false;
			}
			
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		connectionStatus = false;
	}
}
