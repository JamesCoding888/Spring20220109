package com.study.spring2.case01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// 以前的 new
		Person person = new Person();
		person.setId(1);
		person.setName("Spring");
		System.out.println(person);
		// Spring new 
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person2 = (Person)ctx.getBean("person");
		person2.setId(1);
		person2.setName("Spring");
		System.out.println(person2);
	}
}
