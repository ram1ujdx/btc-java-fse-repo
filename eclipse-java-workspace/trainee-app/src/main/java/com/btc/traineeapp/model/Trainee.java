package com.btc.traineeapp.model;

public class Trainee {

	private int traineeId;
	private String traineeName;
	private String email;
	
	public Trainee() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Trainee(int traineeId, String traineeName, String email) {
		super();
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.email = email;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		return "Trainee [traineeId=" + traineeId + ", traineeName=" + traineeName + ", email=" + email + "]";
	}
	
	
	
	
	
	
}
