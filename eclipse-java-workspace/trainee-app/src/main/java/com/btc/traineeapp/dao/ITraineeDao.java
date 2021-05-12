package com.btc.traineeapp.dao;

import java.sql.SQLException;
import java.util.List;

import com.btc.traineeapp.model.Trainee;

public interface ITraineeDao {

	public Trainee getTraineeById(int traineeId) throws SQLException;
	public Trainee saveTrainee(Trainee trainee)throws SQLException;
	public boolean deleteTrainee(int traineeId)throws SQLException;
	public Trainee updateTrainee(Trainee trainee)throws SQLException;
	public List<Trainee> getAllTrainees()throws SQLException;
	
	
}
