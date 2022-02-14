package com.study.spring2.case01;

import org.springframework.context.ApplicationContext;   
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest2 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		//Husband & Wife - 若為相依關係，切記!!! 不要用精靈實作 Override toString() 避免產生 StackOverFlowError
		Husband husband1 = (Husband)ctx.getBean("husband1");		
		Wife wife1 = (Wife)ctx.getBean("wife1");
		System.out.printf("%s 的老婆: %s\n", husband1.getName(), husband1.getWife().getName());
		System.out.printf("%s 的老公: %s\n", wife1.getName(), wife1.getHusband().getName());
		Husband husband2 = (Husband)ctx.getBean("husband2");		
		Wife wife2 = (Wife)ctx.getBean("wife2");
		System.out.printf("%s 的老婆: %s\n", husband2.getName(), husband2.getWife().getName());
		System.out.printf("%s 的老公: %s\n", wife2.getName(), wife2.getHusband().getName());
	}
}
