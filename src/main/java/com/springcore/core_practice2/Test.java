package com.springcore.core_practice2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Spring Core");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("core_Config3.xml");
		
		Student s1=(Student)context.getBean("stud1");
		System.out.println(s1);
		
			
	}

}
