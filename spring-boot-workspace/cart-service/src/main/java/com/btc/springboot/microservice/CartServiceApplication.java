package com.btc.springboot.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CartServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CartServiceApplication.class, args);
	}
	
	@Bean
	public RestTemplate getRestTemplateBean() {
		return new RestTemplate();
	}

}
