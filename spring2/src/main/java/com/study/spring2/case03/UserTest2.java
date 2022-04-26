package com.study.spring2.case03;
import org.springframework.context.ApplicationContext;         
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.spring2.case03.model.User;
public class UserTest2 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext3.xml");
		User user = ctx.getBean("user", User.class);
		Page page = ctx.getBean("page", Page.class);
		System.out.println(user);
		System.out.println(page);	
	}
}
