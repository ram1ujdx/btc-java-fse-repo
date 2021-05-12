package com.btc.traineeapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.btc.traineeapp.errors.TraineeNotFoundException;
import com.btc.traineeapp.model.Trainee;

public class TraineeDaoImpl implements ITraineeDao {
	
	Connection con;
	PreparedStatement psmt;
	ResultSet resultSet;
	
	public TraineeDaoImpl() {
		con=DbUtil.getConnection();
	}
	

	@Override
	public Trainee getTraineeById(int traineeId) throws SQLException {
		
		psmt=con.prepareStatement("select * from trainee where t_id=?");
		psmt.setInt(1, traineeId);
		
		resultSet=psmt.executeQuery();
		
		if(resultSet.next()) {
			Trainee trainee=new Trainee();
			trainee.setTraineeId(resultSet.getInt("t_id"));
			trainee.setTraineeName(resultSet.getString("t_name"));
			trainee.setEmail(resultSet.getString("email"));
			return trainee;
		}
		else {
			throw new TraineeNotFoundException("No Trainee found with id - "+traineeId);
		}
		
		
	}

	@Override
	public Trainee saveTrainee(Trainee trainee) throws SQLException {
		psmt=con.prepareStatement("insert into Trainee values(?,?,?)");
		psmt.setInt(1, trainee.getTraineeId());
		psmt.setString(2, trainee.getTraineeName());
		psmt.setString(3, trainee.getEmail());
		int count=psmt.executeUpdate();
		if(count>0) {
			return trainee;
		}
		
		return null;
	}

	@Override
	public boolean deleteTrainee(int traineeId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Trainee updateTrainee(Trainee trainee) throws SQLException {
		psmt=con.prepareStatement("update trainee set t_name=?, email=? where t_id=?");
		psmt.setInt(3, trainee.getTraineeId());
		psmt.setString(1, trainee.getTraineeName());
		psmt.setString(2, trainee.getEmail());
		int count=psmt.executeUpdate();
		if(count>0) {
			return trainee;
		}
		
		return null;
	}

	@Override
	public List<Trainee> getAllTrainees() {
		// TODO Auto-generated method stub
		return null;
	}

}
