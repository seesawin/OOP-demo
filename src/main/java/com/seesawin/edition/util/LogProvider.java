package com.seesawin.edition.util;

public class LogProvider implements LogSpec{
	public void print(String action) {
		System.out.println(action);
	}

	public void info(String action) {
		System.out.println(action);
	}
}
