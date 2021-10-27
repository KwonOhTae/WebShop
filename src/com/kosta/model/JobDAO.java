package com.kosta.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.kosta.util.DBUtil2;

public class JobDAO {
	public List<JobVO> selectAll() {
		List<JobVO> joblist = new ArrayList<>();
		String sql = "select job_id, job_title from jobs order by 1";
		Connection conn = DBUtil2.dbConnect();
		Statement st = null;
		ResultSet rs = null;
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				joblist.add(new JobVO(rs.getString(1), rs.getString(2)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil2.dbClose(conn, st, rs);
		}
		return joblist;
	}
}
