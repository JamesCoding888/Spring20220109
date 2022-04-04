package com.study.spring2.case02;

import org.springframework.context.ApplicationContext; 
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest2 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext2.xml");
		StudentOfClazz s1 = (StudentOfClazz)ctx.getBean("studentOfClazz1");
		System.out.println(s1);
		((ClassPathXmlApplicationContext)ctx).close();
	}
}
