package com.seesawin.edition.util;

public class NewLogProvider implements LogSpec{
	public void snapshot(String action) {
		System.out.println(action);
	}
	
	public void info(String action) {
		System.out.println(action);
	}
}
