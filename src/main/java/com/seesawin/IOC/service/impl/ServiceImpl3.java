package com.seesawin.IOC.service.impl;

import com.seesawin.IOC.dao.Dao;
import com.seesawin.IOC.service.Service;

public class ServiceImpl3 implements Service {
	Dao dao = null;
	
	public void setDao(Dao dao) {
		this.dao = dao;
	}

	public String getName() {
		return dao.getName();
	}
}
