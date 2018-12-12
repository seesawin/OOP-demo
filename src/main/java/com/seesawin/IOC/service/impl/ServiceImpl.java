package com.seesawin.IOC.service.impl;

import com.seesawin.IOC.dao.Dao;
import com.seesawin.IOC.dao.impl.DaoImpl;
import com.seesawin.IOC.service.Service;

public class ServiceImpl implements Service {
	Dao dao = new DaoImpl();

	public String getName() {
		return dao.getName();
	}

	public String getName(String name) {
		return dao.getName(name);
	}
}
