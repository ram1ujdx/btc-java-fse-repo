package com.btc.traineeapp.dto;

public class TraineeDto {

	private int traineeId;
	private String traineeName;
	private String traineeEmail;
	
	public TraineeDto() {
		// TODO Auto-generated constructor stub
	}

	public TraineeDto(int traineeId, String traineeName, String traineeEmail) {
		super();
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.traineeEmail = traineeEmail;
	}

	public int getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	public String getTraineeEmail() {
		return traineeEmail;
	}

	public void setTraineeEmail(String traineeEmail) {
		this.traineeEmail = traineeEmail;
	}

	@Override
	public String toString() {
		return "TraineeDto [traineeId=" + traineeId + ", traineeName=" + traineeName + ", traineeEmail=" + traineeEmail
				+ "]";
	}
	
	
	
	
	
}
