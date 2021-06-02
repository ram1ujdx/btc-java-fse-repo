package com.btc.springapp;

import org.springframework.stereotype.Component;

@Component("vi")
public class VISim implements Sim{
	
	public VISim(String value) {
		// TODO Auto-generated constructor stub
	}
	public VISim() {
		// TODO Auto-generated constructor stub
	}

	public void call() {
		System.out.println("Making a call using VI Sim...");
	}
	
	public void sendSms() {
		System.out.println("Message Sent using VI Sim...");
	}
	
}
