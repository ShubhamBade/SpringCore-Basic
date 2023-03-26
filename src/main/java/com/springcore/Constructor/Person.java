package com.springcore.Constructor;

import java.util.List;

public class Person {
	
	String name;
	int age;
	Address address;
	List<String> list;
	public Person(String name, int age, Address address,List<String> list) {
		super();
		System.out.println("First(string , int) Constructor called :");
		this.name = name;
		this.age = age;
		this.address=address;
		this.list=list;
	}
	
	public Person(String name, String age,Address address,List<String> list) {
		System.out.println("Second(String , string) Constructor called :");
		this.name = name;
		this.age = Integer.parseInt(age);
		this.address=address;
		this.list=list;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", List =" +list + "]"+"\nAdsress :"+address;
	}
	
	public void init() {
		System.out.println("----------Init method invoked-------");
	}
	
	public void destroy() {
		System.out.println("----------Destroy method invoked-------");
	}
}
