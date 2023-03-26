package com.springcore.core_practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome To the Spring Core");
		
		System.out.println("Tradtional Way:");
		Employee e= new Employee(100,"Shubham","450000");
		System.out.println(e);
		
		System.out.println("Using Spring IOC Container : ApplicationContext");
		
		ApplicationContext context= new ClassPathXmlApplicationContext("core_config2.xml");
		
		Employee emp=(Employee)context.getBean("emp1");
		System.out.println(emp);
		
		System.out.println();
		System.out.println("-------------Setter Injection-----------------");
		
		Employee empl= (Employee) context.getBean("emp2");
		System.out.println(empl);
		empl.display();
		
		ClassPathXmlApplicationContext ctx=(ClassPathXmlApplicationContext)context;
		ctx.close();
	}

}
