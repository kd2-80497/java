package com.ojaswi.candidate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CandidateDAO implements AutoCloseable {
	private Connection con;

	public CandidateDAO() throws SQLException {
		con = Dbutil.getConnection();
	}

	@Override
	public void close() throws SQLException {

		if (con != null)
			con.close();
	}

	public int save(Candidate c) throws Exception {
		// int cnt=0;
		String sql = "INSERT INTO candidates VALUES(default,?,?,?)";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, c.getName());
			stmt.setString(2, c.getParty());
			stmt.setInt(3, c.getVotes());
			int cnt = stmt.executeUpdate();
			return cnt;

		}

	}

	public int update(Candidate c) throws Exception {

		String sql = "UPDATE candidates set name=? ,party=? Where id=?   ";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {

			stmt.setString(1, c.getName());
			stmt.setString(2, c.getParty());
			stmt.setInt(3, c.getId());
			int cnt = stmt.executeUpdate();
			return cnt;
		}

	}

	public List<PartyVotes> getPartyWiseVotes() throws Exception {
		List<PartyVotes> list = new ArrayList<PartyVotes>();
		String sql = "SELECT party ,sum(votes) totalVotes  FROM candidates GROUP BY party";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {

					String party = rs.getString("party");
					int votes = rs.getInt("totalVotes");
					PartyVotes pv = new PartyVotes(party, votes);
					list.add(pv);

				}
			}

		}

		return list;
	}

}
