package com.springcore.core_practice;

public class Address {
	String City;
	String Country;
	String pincode;
	
	public Address(String city, String country, String pincode) {
		super();
		City = city;
		Country = country;
		this.pincode = pincode;
	}
	public Address() {
		super();
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [City=" + City + ", Country=" + Country + ", pincode=" + pincode + "]";
	}
	
}
