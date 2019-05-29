package com.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("network-beans.xml");
		System.out.println("IOC context is created..");
		System.out.println("IOC container will take responsiblity of creating objects for "
				+ "which we declared in configuration file.");
		/*Airtel airtel = (Airtel)context.getBean("airtel");
		airtel.calling();
		airtel.data();
	*/
	//Now we are adding one more network. In this we'll how to desgin the application 
	// which out touching the code.
		
		//Sim sim = context.getBean("jio", Jio.class);
		Sim sim = context.getBean("airtel", Airtel.class);
		sim.calling();
		sim.data();
	
	}

}
