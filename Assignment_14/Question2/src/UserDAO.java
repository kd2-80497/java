import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

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

	// add new user

	public int save(User u) throws SQLException, ParseException {

		String sql = "INSERT INTO users VALUES(default,?,?,?,?,?,true,default)";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, u.getFirst_name());
			stmt.setString(2, u.getLast_name());
			stmt.setString(3, u.getEmail());
			stmt.setString(4, u.getPassword());
			String date = u.getDob();
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			java.util.Date uDate = sdf.parse(date);

			java.sql.Date sDate = new java.sql.Date(uDate.getTime());
			stmt.setDate(5, sDate);
			int cnt = stmt.executeUpdate();
			return cnt;

		}
	}

	public int delete(int id) throws SQLException {

		String sql = "DELETE FROM users WHERE ID= ?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1, id);
			int cnt = stmt.executeUpdate();

			return cnt;

		}
	}

	public int update(int id, String fname, String lname, String email, String pw, String db)
			throws SQLException, ParseException {
		String sql = "UPDATE  users set first_name=?,last_name=?,email=?,password=?,dob=? WHERE ID=?";
		try (PreparedStatement stmt = con.prepareCall(sql)) {
			stmt.setString(1, fname);
			stmt.setString(2, lname);
			stmt.setString(3, email);
			stmt.setString(4, pw);
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			java.util.Date ud = sdf.parse(db);
			java.sql.Date sd = new java.sql.Date(ud.getTime());

			stmt.setDate(5, sd);
			stmt.setInt(6, id);

			int cnt = stmt.executeUpdate();

			return cnt;
		}

	}

	public int changeStatus(int id) throws SQLException {

		String sql = "UPDATE users set status=0 where id =?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1, id);
			int cnt = stmt.executeUpdate();
			return cnt;

		}
	}

	public List<User> display() throws SQLException {
		List<User> list = new ArrayList<User>();
		String sql = "SELECT * FROM users";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					int id = rs.getInt("id");
					String fname = rs.getString("first_name");
					String lname = rs.getString("last_name");
					String email = rs.getString("email");
					String pw = rs.getString("password");
					Date dt = rs.getDate("dob");
					java.util.Date udate = new java.util.Date(dt.getTime());
					SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
					String str = sdf.format(udate);

					boolean status = rs.getBoolean("status");
					String role = rs.getString("role");
					User u = new User(id, fname, lname, email, pw, str, status, role);
					list.add(u);
				}

			}
		}
		return list;
	}

	public List<User> displaySpecificId(int id) throws SQLException{
		
		List<User> list = new ArrayList<User>();
		String sql = "SELECT * FROM users where id = ?";
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			stmt.setInt(1, id);
		
			try (ResultSet rs = stmt.executeQuery()) {
			
			
				while (rs.next()) {
					int id1 = rs.getInt("id");
					String fname = rs.getString("first_name");
					String lname = rs.getString("last_name");
					String email = rs.getString("email");
					String pw = rs.getString("password");
					Date dt = rs.getDate("dob");
					java.util.Date udate = new java.util.Date(dt.getTime());
					SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
					String str = sdf.format(udate);

					boolean status = rs.getBoolean("status");
					String role = rs.getString("role");
					User u = new User(id1, fname, lname, email, pw, str, status, role);
					list.add(u);
				}
			}
		}
	return list;	
		
	}
	
}
