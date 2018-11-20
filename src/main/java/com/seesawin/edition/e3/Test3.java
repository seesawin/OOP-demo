package com.seesawin.edition.e3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.seesawin.edition.util.LogSpec;

public class Test3 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "application-context.xml" });
		LogSpec log = (LogSpec) context.getBean("myLogger");
		
		log.info("step 3");
		log.info("step 4");
	}

}
