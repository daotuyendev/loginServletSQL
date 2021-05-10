package login.submit.registration;

import java.sql.Connection;
import java.sql.DriverManager; 

public class MyConnectionProvider implements MyProvider {
	static Connection con=null;
	public static Connection getCon() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con=DriverManager.getConnection(connUrl, username, pwd);
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}
}
