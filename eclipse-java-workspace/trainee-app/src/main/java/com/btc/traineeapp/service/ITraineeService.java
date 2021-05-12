package com.btc.traineeapp.service;

import java.sql.SQLException;
import java.util.List;

import com.btc.traineeapp.dto.TraineeDto;



public interface ITraineeService {

	public TraineeDto getTraineeById(int traineeId) throws SQLException;
	public TraineeDto saveTrainee(TraineeDto trainee)throws SQLException;
	public boolean deleteTrainee(int traineeId)throws SQLException;
	public TraineeDto updateTrainee(TraineeDto trainee)throws SQLException;
	public List<TraineeDto> getAllTrainees()throws SQLException;
	
	
}
