package com.kosta.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DBUtil2 {

	public static void dbClose(Connection conn, Statement st, ResultSet rs) {
		// 자원반납
		try {
			if (rs != null)
				rs.close();
			if (st != null)
				st.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static Connection dbConnect() {
		// DB연결 ... Connection Pooling기능을 이용
		Context initContext;
		Connection conn = null;
		try {
			initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:/comp/env");
			DataSource ds = (DataSource) envContext.lookup("jdbc/myoracle");
			conn = ds.getConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (NamingException e) {
			e.printStackTrace();
			}
		return conn;
		}
}