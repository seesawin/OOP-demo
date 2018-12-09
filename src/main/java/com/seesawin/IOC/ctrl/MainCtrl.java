package com.seesawin.IOC.ctrl;

import com.seesawin.IOC.dao.impl.DaoImpl2;
import com.seesawin.IOC.dao.impl.DaoImpl3;
import com.seesawin.IOC.service.Service;
import com.seesawin.IOC.service.impl.ServiceImpl;
import com.seesawin.IOC.service.impl.ServiceImpl2;
import com.seesawin.IOC.service.impl.ServiceImpl3;

public class MainCtrl {

	public static void main(String[] args) {
		Service service1 = new ServiceImpl();
		String name1 = service1.getName();
		System.out.println("name1 : " + name1);

		Service service2 = new ServiceImpl2(new DaoImpl2());
		String name2 = service2.getName();
		System.out.println("name2 : " + name2);

		ServiceImpl3 service3 = new ServiceImpl3();
		service3.setDao(new DaoImpl3());
		String name3 = service3.getName();
		System.out.println("name3 : " + name3);
	}

}
