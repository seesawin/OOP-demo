package com.seesawin.IOC.dao.impl;

import com.seesawin.IOC.dao.Dao;

public class DaoImpl3 implements Dao{
	public String getName() {
		return "Andy Hsu";
	}
	
	public String getName(String name) {
		return "Hello " + name + "!";
	}
}
