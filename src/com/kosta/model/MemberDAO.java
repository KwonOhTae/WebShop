package com.kosta.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.kosta.util.DBUtil2;

public class MemberDAO {
	public MemberVO loginChk(int mid, String mpassword) {
		MemberVO member = null;
		String sql = "select * from member where mid=? and mpassword=? ";
		Connection conn = DBUtil2.dbConnect();
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement(sql);
			st.setInt(1, mid);
			st.setString(2, mpassword);
			rs = st.executeQuery();
			while (rs.next()) {
				member = new MemberVO(mid, mpassword, rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil2.dbClose(conn, st, rs);
		}
		return member;
	}
}
