package com.seesawin.DI;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "application-di-context.xml" });
		UserBean userBean1 = (UserBean) context.getBean("UserBean1");
		System.out.println("userBean1 : " + userBean1.hashCode());
		System.out.println("userBean1 : " + userBean1.toString());

		Order od1 = userBean1.getOrder();
		List<OrderDtl> odDtls1 = od1.getOrderDtl();
		for (OrderDtl odDt2 : odDtls1) {
			System.out.println(odDt2.hashCode());
		}

		UserBean userBean2 = (UserBean) context.getBean("UserBean2");
		System.out.println("userBean2 : " + userBean2.hashCode());
		System.out.println("userBean2 : " + userBean2.toString());

		Order od2 = userBean2.getOrder();
		List<OrderDtl> odDtls2 = od2.getOrderDtl();
		for (OrderDtl odDtl2 : odDtls2) {
			System.out.println(odDtl2.hashCode());
		}
	}

}
