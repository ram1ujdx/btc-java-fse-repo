package com.btc.springapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		Phone phone=context.getBean("samsung",Phone.class);
		phone.makeACall();
		System.out.println("Sim -> "+phone.getSimInfo());
		System.out.println(phone);
		
//		System.out.println("\n...................................\n");
//		
//		Phone phone2=context.getBean("apple",Phone.class);
//		phone2.makeACall();
//		System.out.println("Sim -> "+phone2.getSimInfo());
//		System.out.println(phone2);
		
		
//		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
//		Phone phone=context.getBean("phone1",Phone.class);
//		phone.makeACall();
//		System.out.println("Sim -> "+phone.getSimInfo());
//		System.out.println(phone);
//		
//		System.out.println("\n...................................\n");
//		
//		Phone phone2=context.getBean("phone2",Phone.class);
//		phone2.makeACall();
//		System.out.println("Sim -> "+phone2.getSimInfo());
//		System.out.println(phone2);
		
		
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
