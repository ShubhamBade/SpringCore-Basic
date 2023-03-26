package com.springcore.core_practice;

public class Employee {
	int empid;
	String name;
	String Salary;
	Address ad;
	
	public Employee(int empid, String name, String salary) {
		super();
		this.empid = empid;
		this.name = name;
		Salary = salary;
	}
	public Employee(Address ad) {
		System.out.println("Constructor Injection : ");
		this.ad= ad;
	}
	
	public void setAddress(Address ad) {
		System.out.println("SetterInjection");
		this.ad=ad;
	}
	
	public Address getAd() {
		return ad;
	}

	public void setAd(Address ad) {
		this.ad = ad;
	}

	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalary() {
		return Salary;
	}
	public void setSalary(String salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", Salary=" + Salary + "]";
	}
	public Employee() {
		System.out.println("Empoyee Object Is Constructed ");
	}
	
	public void myInit() {
		System.out.println("Init- Method Called");
	}
	
	public void myDestroy() {
		System.out.println(" Destroyed Method Called before Destrying the Objects");
	}
	
	public void display() {
		System.out.println(""+ad);
	}
}
