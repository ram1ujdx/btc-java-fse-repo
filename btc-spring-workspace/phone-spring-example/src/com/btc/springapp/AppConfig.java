package com.btc.springapp;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.btc.springapp"})
@PropertySource("phone.properties")
public class AppConfig {
	
	
//	@Bean("samsung")
//	public Phone getSamsungPhone() {
//		Phone samsung=new Phone();
//		
//		samsung.setBrand("Samsung");
//		samsung.setRam(8);
//		samsung.setNetworks(Arrays.asList("5G","4G LTE","HSPA","GSM"));
//		return samsung;
//	}
//	
	@Bean("apple")
	public Phone getIPhone() {
		Phone apple=new Phone("Apple",4);
		
		apple.setNetworks(Arrays.asList("4G LTE","HSPA","GSM"));
		return apple;
	}

}
