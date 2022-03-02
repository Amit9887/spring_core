package com.amit.demo_bean;

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
        System.out.println( "Hello Bean !" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/amit/demo_bean/config.xml");
        
        Employee emp = context.getBean("emp", Employee.class);
        System.out.println(emp);
        
    }
}
