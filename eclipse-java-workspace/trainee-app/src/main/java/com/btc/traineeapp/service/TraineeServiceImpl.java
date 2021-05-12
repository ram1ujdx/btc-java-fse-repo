package com.btc.traineeapp.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.btc.traineeapp.dao.ITraineeDao;
import com.btc.traineeapp.dao.TraineeDaoImpl;
import com.btc.traineeapp.dto.TraineeDto;
import com.btc.traineeapp.model.Trainee;

public class TraineeServiceImpl implements ITraineeService {

	ITraineeDao dao = new TraineeDaoImpl();

	private Trainee dtoToTrainee(TraineeDto dto) {
		Trainee trainee = new Trainee();
		trainee.setTraineeId(dto.getTraineeId());
		trainee.setEmail(dto.getTraineeEmail());
		trainee.setTraineeName(dto.getTraineeName());
		return trainee;
	}

	private TraineeDto traineeToDto(Trainee trainee) {
		TraineeDto dto = new TraineeDto();
		dto.setTraineeId(trainee.getTraineeId());
		dto.setTraineeEmail(trainee.getEmail());
		dto.setTraineeName(trainee.getTraineeName());
		return dto;
	}

	@Override
	public TraineeDto getTraineeById(int traineeId) throws SQLException {

		Trainee trainee = dao.getTraineeById(traineeId);
		return traineeToDto(trainee);
	}

	@Override
	public TraineeDto saveTrainee(TraineeDto traineeDto) throws SQLException {
		Trainee trainee = dtoToTrainee(traineeDto);
		trainee = dao.saveTrainee(trainee);
		return traineeToDto(trainee);
	}

	@Override
	public boolean deleteTrainee(int traineeId) throws SQLException {

		return dao.deleteTrainee(traineeId);
	}

	@Override
	public TraineeDto updateTrainee(TraineeDto traineeDto) throws SQLException {
		Trainee trainee = dtoToTrainee(traineeDto);
		trainee = dao.updateTrainee(trainee);
		return traineeToDto(trainee);
	}

	@Override
	public List<TraineeDto> getAllTrainees() throws SQLException {
		List<TraineeDto> dtos=new ArrayList<>();
		dao.getAllTrainees().forEach(trainee->{
											TraineeDto dto=traineeToDto(trainee);
											dtos.add(dto);
											});
		return dtos;
	}
}


