package com.springcore.core_Project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Traditional Way of Creating Object  and calling Methods" );
//    	Employee emp=new Employee();
//    	emp.setEid(101);
//    	emp.setEname("Shubham Bade");
//    	emp.setEsalary("450000");
//    	System.out.println(emp);
    	
    	System.out.println("Using IOC - ApplicationContext");
    	
    	ApplicationContext context= new  ClassPathXmlApplicationContext("core_Config.xml");
    	Employee e1=(Employee) context.getBean("emp1");
    	System.out.println(e1);
    	
    	Employee e2=(Employee) context.getBean("emp2");
    	System.out.println(e2);
 
    	ClassPathXmlApplicationContext cxt=(ClassPathXmlApplicationContext)context;
    	cxt.close();
    	
    }
}
