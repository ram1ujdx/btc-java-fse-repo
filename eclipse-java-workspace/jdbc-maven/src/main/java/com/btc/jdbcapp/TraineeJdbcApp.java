package com.btc.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TraineeJdbcApp {

	public static void main(String[] args) throws SQLException {

		Scanner scan = new Scanner(System.in);
		ResultSet result;

		// Create Connection
		String url, user, password;
		url = "jdbc:mysql://localhost:3306/bt_db";
		user = "root";
		password = "password";
		Connection con = DriverManager.getConnection(url, user, password);

		/*
		 * Read Operation
		 * 
		 * // Create Statement Statement smt=con.createStatement();
		 * 
		 * // Execute Query
		 * result=smt.executeQuery("select * from trainee where t_name='Prakash'");
		 * 
		 * // Process ResultSet
		 * 
		 * while(result.next()) {
		 * System.out.println(result.getInt("t_id")+"\t"+result.getString("t_name")+"\t"
		 * +result.getString("email")); }
		 */

		/*
		 * Inserting Data
		 * 
		 * int traineeId=1004; String traineeName="Harshit"; String
		 * email="harshit@gmail.com"; //Statement smt=con.createStatement();
		 * 
		 * //int r=smt.executeUpdate("insert into trainee values("+traineeId+",'"+
		 * traineeName+"', '"+email+"')");
		 * 
		 * PreparedStatement
		 * psmt=con.prepareStatement("insert into trainee values(?,?,?)");
		 * 
		 * psmt.setInt(1, traineeId); psmt.setString(2, traineeName); psmt.setString(3,
		 * email);
		 * 
		 * int r=psmt.executeUpdate();
		 * 
		 * if(r>0) { System.out.println("Record Inserted"); }
		 */

		/*
		 * Deleting Data
		 * 
		 * System.out.println("Enter trainee id to delete : "); int
		 * traineeId=scan.nextInt();
		 * 
		 * PreparedStatement
		 * psmt=con.prepareStatement("delete from trainee where t_id=?"); psmt.setInt(1,
		 * traineeId);
		 * 
		 * int r=psmt.executeUpdate(); if(r>0) {
		 * System.out.println("Deleted Successfully"); }
		 */
		
		// Updating Records
		
		System.out.println("Enter trainee id : ");
		int traineeId = scan.nextInt();
		System.out.println("Enter new email : ");
		String email = scan.next() + scan.nextLine();

		PreparedStatement psmt = con.prepareStatement("update trainee set email=? where t_id=?");
		psmt.setInt(2, traineeId);
		psmt.setString(1, email);
		int r = psmt.executeUpdate();
		if (r > 0) {
			System.out.println("Updated Successfully");
		}

	}

}
