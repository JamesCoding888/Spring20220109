package com.study.spring2.case05.aop_dancer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {
	public static void main(String[] args) {
		// Java 配置
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AOPConfig.class);
		// 1. 和 2. 都可得到 bean 的物件
		// 1.
		Performance performance = (Performance)ctx.getBean("dancer");
		// 2.
//		Performance performance = ctx.getBean("dancer", Performance.class);
		System.out.println(performance); // 確認 bean 的記憶體來至 Dancer
		performance.perform();		
	}	
}