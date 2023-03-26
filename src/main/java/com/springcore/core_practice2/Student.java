package com.springcore.core_practice2;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
	
	@Override
	public String toString() {
		return "Student [name=" + name + "\n List :phones=" + phones + "\n address=" + address + "\n courses=" + courses + "]";
	}
	String name;
	List<String> phones;
	Set<String>  address;
	Map<String, String> courses;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Student(String name, List<String> phones, Set<String> address, Map<String, String> courses) {
		super();
		this.name = name;
		this.phones = phones;
		this.address = address;
		this.courses = courses;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
