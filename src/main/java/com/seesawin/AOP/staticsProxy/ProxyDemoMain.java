package com.seesawin.AOP.staticsProxy;

public class ProxyDemoMain {
	public static void main(String[] args) {
		IHello proxy = new HelloProxy(new HelloSpeaker());
		proxy.hello("Justin");
	}
}
