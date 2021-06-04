package com.btc.springapp;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("airtel")
@Scope("prototype")
public class AirtelSim implements Sim {
	
	public AirtelSim() {
		System.out.println("Airtel Bean Created");
	}

	public void call() {
		System.out.println("Making a call using Airtel Sim...");
	}
	
	public void sendSms() {
		System.out.println("Message Sent using Airtel Sim...");
	}
	
}
