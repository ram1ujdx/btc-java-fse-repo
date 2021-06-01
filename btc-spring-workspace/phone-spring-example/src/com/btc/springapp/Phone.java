package com.btc.springapp;

public class Phone {

	private Sim sim;
	
	
	public Sim getSim() {
		return sim;
	}

	public void setSim(Sim sim) {
		this.sim = sim;
	}

	public void makeACall() {
		sim.call();
	}
	
	public void sendSms() {
		sim.sendSms();
	}
	
	
}
