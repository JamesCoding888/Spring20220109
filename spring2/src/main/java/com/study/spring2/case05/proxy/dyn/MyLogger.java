package com.study.spring2.case05.proxy.dyn;
// 切面程式
public class MyLogger {
	// 前置通知
	public static void before(Class cls, String methodName, Object[] args) {
		System.out.printf("前置通知: %s %s %s\n", cls, methodName, args);		
	}
	// 後置通知
	public static void after(Class cls, String methodName, Object result) {
		System.out.printf("後置通知: %s %s %s\n", cls, methodName, result);		
	}
	// 異常通知
	public static void throwing(Class cls, String errorMessage) {
		System.out.printf("異常通知: %s %s\n", cls, errorMessage);
	}
}
