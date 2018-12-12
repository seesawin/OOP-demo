package com.seesawin.AOP.spring;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LogAdvice {
	public void logBefore(JoinPoint point) {
		System.out.println("before : at " + point.getTarget().getClass());
		System.out.println("calling : " + point.getSignature().getName());
		System.out.println("using : " + Arrays.toString(point.getArgs()));
		System.out.println("before goining into JpinPoint methid");
	}

	public void logAfter(JoinPoint point, Object result) {
		System.out.println("after : JoinPoint method finished");
		System.out.println("result : " + result);

	}

	public Object logAround(ProceedingJoinPoint point) throws Throwable {
		System.out.println("===========================================");
		System.out.println("around : at " + point.getTarget().getClass());
		System.out.println("calling : " + point.getSignature().getName());
		System.out.println("using : " + Arrays.toString(point.getArgs()));

		Object result = point.proceed();
		System.out.println("around result : " + result);
		System.out.println("===========================================");
		
		return result;
	}

	public void logThrow(JoinPoint point, Throwable exception) {
		System.out.println("Exception : " + exception);
	}
}
