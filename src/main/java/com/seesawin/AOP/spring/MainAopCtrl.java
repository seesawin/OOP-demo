package com.seesawin.AOP.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.seesawin.IOC.service.Service;

public class MainAopCtrl {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "application-aop-context.xml" });
		Service service1 = (Service) context.getBean("ServiceImpl");
		String name1 = service1.getName("Coco");
		System.out.println("name1 : " + name1);
		
		System.out.println("--------------------------------------");

		Service service2 = (Service) context.getBean("ServiceImpl2");
		String name2 = service2.getName("Alice");
		System.out.println("name2 : " + name2);

		System.out.println("--------------------------------------");

		Service service3 = (Service) context.getBean("ServiceImpl3");
		String name3 = service3.getName("Jobs");
		System.out.println("name3 : " + name3);
	}

}
