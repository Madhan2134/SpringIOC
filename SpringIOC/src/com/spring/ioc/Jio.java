package com.spring.ioc;

class Jio implements Sim{

	public Jio() {
		System.out.println("Object is created by IOC container for Airtel object");
	}
	@Override
	public void calling() {
		System.out.println("Calling from Jio network..");
	}

	@Override
	public void data() {
		System.out.println("Browsing from Jio network with unlimited data");
	}

}
