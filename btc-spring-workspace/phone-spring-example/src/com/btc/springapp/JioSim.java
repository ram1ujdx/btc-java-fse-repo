package com.btc.springapp;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("jio")
@Scope("prototype")
public class JioSim implements Sim{
	
	public JioSim() {
		System.out.println("JIO Bean Created");
	}

	public void call() {
		System.out.println("Making a call using Jio Sim...");
	}
	
	public void sendSms() {
		System.out.println("Message Sent using Jio Sim...");
	}
	
}
