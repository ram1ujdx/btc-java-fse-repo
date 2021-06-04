package com.btc.example.springboot.model;

public class Coder {

	private String tname;
	private String email;
	
	public Coder() {
		// TODO Auto-generated constructor stub
	}
	

	public Coder(String tname, String email) {
		super();
		this.tname = tname;
		this.email = email;
	}


	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Coder [tname=" + tname + ", email=" + email + "]";
	}
	
	
	
	
	
}
