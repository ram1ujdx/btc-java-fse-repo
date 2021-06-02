package com.btc.springapp;

import org.springframework.stereotype.Component;

@Component("jio")
public class JioSim implements Sim{
	
	

	public void call() {
		System.out.println("Making a call using Jio Sim...");
	}
	
	public void sendSms() {
		System.out.println("Message Sent using Jio Sim...");
	}
	
}
