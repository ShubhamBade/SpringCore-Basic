package com.springcore.core_Project;

public class Employee {
	private int eid;
	private String ename;
	private String esalary;
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
	}
	public Employee(int eid, String ename, String esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
		System.out.println("Construtcor Called");
	}
	public int getEid() {
		return eid;
	}
	public Employee() {
		super();
	}
	public void setEid(int eid) {
		System.out.println("Set Called");
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		System.out.println("Set Called");
		this.ename = ename;
	}
	public String getEsalary() {
		return esalary;
	}
	public void setEsalary(String esalary) {
		System.out.println("Set Called");
		this.esalary = esalary;
	}
	
	public void myInit() {
		System.out.println("Init-method called");
	}
	
	public void myDestroy() {
		System.out.println("Destroyed-method called");
	}

}
