package com.btc.springapp;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("vi")
@Scope("prototype")
public class VISim implements Sim{
	
	public VISim(String value) {
		// TODO Auto-generated constructor stub
	}
	public VISim() {
		System.out.println("VI Sim Created");
	}

	public void call() {
		System.out.println("Making a call using VI Sim...");
	}
	
	public void sendSms() {
		System.out.println("Message Sent using VI Sim...");
	}
	
}
