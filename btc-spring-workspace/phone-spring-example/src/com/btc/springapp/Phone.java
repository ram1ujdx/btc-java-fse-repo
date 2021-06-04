package com.btc.springapp;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component("samsung")
@Scope("prototype")
public class Phone implements InitializingBean, DisposableBean {

	@Autowired
	@Qualifier("vi")
	private Sim sim;
	
	@Value("${brand}")
	private String brand;
	@Value("${ram}")
	private int ram;
	@Value("${networks}")
	private List<String> networks;
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initialization Completed");
		
	}
	public Phone() {
		System.out.println("Phone Bean Created");
	}
	

	public void preInit() {
		System.out.println("Initialization Completed");
	}
	
	public Phone(String brand, int ram) {
		super();
		this.brand = brand;
		this.ram = ram;

	}

	public String getSimInfo() {
		return sim.getClass().getSimpleName();
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public void setNetworks(List<String> networks) {
		this.networks = networks;
	}

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

	@Override
	public String toString() {
		return "Phone [ brand=" + brand + ", ram=" + ram + ", networks=" + networks + "]";
	}
	
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}
