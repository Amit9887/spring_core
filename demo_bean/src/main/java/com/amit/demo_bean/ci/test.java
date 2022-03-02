package com.amit.demo_bean.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/amit/demo_bean/ci/config.xml");
		student st = context.getBean("st", student.class);
		System.out.println(st);
	}

}
