package com.btc.traineeapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {

	public static Connection getConnection() {
		Connection con=null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bt_db", "root", "password");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	
	
}
