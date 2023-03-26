package com.springcore.Constructor;

public class BeanLifeUsingAnnotation {
	
	String ver;

	public BeanLifeUsingAnnotation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BeanLifeUsingAnnotation(String ver) {
		super();
		this.ver = ver;
	}

	@Override
	public String toString() {
		return "BeanLifeUsingAnnotation [version=" + ver + "]";
	}

	public String getVer() {
		return ver;
	}

	public void setVer(String ver) {
		this.ver = ver;
	}
	
	public void start() {
		System.out.println("BeanLifeUsingAnnotation Object constructed : using annotation ==>");
	}
	
	public void stop() {
		System.out.println("BeanLifeUsingAnnotation object Destructed : using Annotation==>");
	}
	
}
