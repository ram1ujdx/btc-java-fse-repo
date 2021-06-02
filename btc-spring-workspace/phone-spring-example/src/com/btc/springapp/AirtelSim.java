package com.btc.springapp;

import org.springframework.stereotype.Component;

@Component("airtel")
public class AirtelSim implements Sim {
	
	

	public void call() {
		System.out.println("Making a call using Airtel Sim...");
	}
	
	public void sendSms() {
		System.out.println("Message Sent using Airtel Sim...");
	}
	
}
