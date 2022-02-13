package com.study.spring2.case01;

import org.springframework.context.ApplicationContext; 
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Author author1 = ctx.getBean(Author.class); // 只針對單一個 Class 路徑中只允許唯一 bean
		Author author1 = (Author)ctx.getBean("author1");
		Author author2 = (Author)ctx.getBean("author2");
		System.out.println(author1);
		System.out.println(author2);
		
		
	}
}
