package com.btc.springapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Phone phone=context.getBean("phone",Phone.class);
		phone.makeACall();
		
		
		
//		Sim sim=context.getBean("sim",Sim.class);
//		
//		phone.setSim(sim);
		
		
//		Phone phone=new Phone();
//		//Sim sim=new Sim(".....");
//		Sim sim=new AirtelSim();
//		
//		phone.setSim(sim);
//		phone.makeACall();
//		
//		sim=new JioSim();
//		phone.setSim(sim);
//		phone.makeACall();

	}

}
