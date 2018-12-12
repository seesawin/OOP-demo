package com.seesawin.IOC.service.impl;

import com.seesawin.IOC.dao.Dao;
import com.seesawin.IOC.service.Service;

public class ServiceImpl2 implements Service {
	public ServiceImpl2() {
	}

	public ServiceImpl2(Dao dao) {
		super();
		this.dao = dao;
	}

	Dao dao = null;

	public String getName() {
		return dao.getName();
	}
	
	public String getName(String name) {
		return dao.getName(name);
	}
}
