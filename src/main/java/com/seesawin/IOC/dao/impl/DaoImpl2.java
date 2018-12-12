package com.seesawin.IOC.dao.impl;

import com.seesawin.IOC.dao.Dao;

public class DaoImpl2 implements Dao{
	public String getName() {
		return "Joey Hsu";
	}
	
	public String getName(String name) {
		return "Hello " + name + "!";
	}
}
