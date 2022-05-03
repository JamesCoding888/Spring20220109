package com.study.spring2.case05.aopxml;
import java.util.Arrays;
import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;
@Component
public class MyLoggerXMLAspect {
	// 前置通知
	public void before(JoinPoint joinPoint) {
		System.out.println("AOP XML 版 - 前置通知");
		String methodName = joinPoint.getSignature().getName();
		Object[] args = joinPoint.getArgs();
		System.out.printf("方法名稱: %s，方法參數: %s\n", methodName, Arrays.toString(args));
	}
	// 後置通知
	public void after(JoinPoint joinPoint) {
		System.out.println("AOP XML 版 - 後置通知");
		String methodName = joinPoint.getSignature().getName();
		Object[] args = joinPoint.getArgs();
		System.out.printf("方法名稱: %s，方法參數: %s\n", methodName, Arrays.toString(args));
	}
	// 返回通知
	public void afterReturning(JoinPoint joinPoint) {
		System.out.println("AOP XML 版 - 返回通知");
		String methodName = joinPoint.getSignature().getName();
		Object[] args = joinPoint.getArgs();
		System.out.printf("方法名稱: %s，方法參數: %s\n", methodName, Arrays.toString(args));
	}
	// 異常通知
	public void afterThrowing(JoinPoint joinPoint) {
		System.out.println("AOP XML 版 - 異常通知");
		String methodName = joinPoint.getSignature().getName();
		Object[] args = joinPoint.getArgs();
		System.out.printf("方法名稱: %s，方法參數: %s\n", methodName, Arrays.toString(args));
	}
	// 環繞通知
	public void around(JoinPoint joinPoint) {
		System.out.println("AOP XML 版 - 環繞通知");
		String methodName = joinPoint.getSignature().getName();
		Object[] args = joinPoint.getArgs();
		System.out.printf("方法名稱: %s，方法參數: %s\n", methodName, Arrays.toString(args));
	}
}
