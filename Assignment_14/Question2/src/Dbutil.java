import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbutil {

	private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String DB_USER = "kd2_80497_ojaswi";
	private static final String DB_PASSWD = "manager";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/test";

	static {
		try {
			Class.forName(DB_DRIVER);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

	public static Connection getConnection() throws SQLException{
		Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
	   return con;
	}

}
