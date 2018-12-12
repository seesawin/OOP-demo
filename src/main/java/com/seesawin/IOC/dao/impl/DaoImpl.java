package com.seesawin.IOC.dao.impl;

import com.seesawin.IOC.dao.Dao;

public class DaoImpl implements Dao{
	public String getName() {
		return "Frank Hsu";
	}

	public String getName(String name) {
		return "Hello " + name + "!";
	}
}
