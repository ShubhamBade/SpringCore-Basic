package com.springcore.Constructor;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Address implements InitializingBean, DisposableBean {
	String City;
	String Country;
	public Address(String city, String country) {
		super();
		City = city;
		Country = country;
	}
	@Override
	public String toString() {
		return "Address [City=" + City + ", Country=" + Country + "]";
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Bean Life Cycle using InitializingBean Method : afterPropertiesSet()===>init()");
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Bean Life Cycle using DisposableBean method : Destroy()");
		
	}
	

}
