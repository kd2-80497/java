import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAO implements AutoCloseable {

	private Connection con;

	public UserDAO() throws SQLException {
		con = Dbutil.getConnection();

	}

	@Override
	public void close() {
		try {
			if (con != null) {
				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	//add new user
	
	public int save(User u) throws SQLException {
		
		String sql="INSERT INTO USER VALUES(default,?,?,?,?,true,?)";
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			stmt.setString(1,u.getFirst_name());
			stmt.setString(2, u.getLast_name());
			stmt.setString(3, u.getEmail());
			stmt.setString(4, u.getPassword());
			stmt.setString(5, u.getDob());
			stmt.setBoolean(6, u.isStatus());
			stmt.setString(7, u.getRole());
			int cnt=stmt.executeUpdate();
			return cnt;
			
		}
	}
	
	
	
	
}
