package com.spring.ioc;

class Airtel implements Sim{

	public Airtel() {
		System.out.println("Object is created by IOC container for Airtel object");
	}
	@Override
	public void calling() {
		System.out.println("Calling from Airtel network..");
	}

	@Override
	public void data() {
		System.out.println("Browsing from Airtel newwork with unlimited data");
	}

}
