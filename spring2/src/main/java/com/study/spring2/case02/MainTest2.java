package com.study.spring2.case02;

import java.util.Set;

import org.springframework.context.ApplicationContext; 
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest2 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext2.xml");
		StudentOfClazz s1 = (StudentOfClazz)ctx.getBean("studentOfClazz1");
		StudentOfClazz s2 = (StudentOfClazz)ctx.getBean("studentOfClazz2");
		StudentOfClazz s3 = (StudentOfClazz)ctx.getBean("studentOfClazz3");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);		
		((ClassPathXmlApplicationContext)ctx).close();
	}
}
