package com.study.spring2.case05.aop;
import org.springframework.context.ApplicationContext;          
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestCalc {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("aop-config.xml");
		Calc calc = ctx.getBean("calcImpl", Calc.class);
//		System.out.println(calc.add(2, 1));		
//		System.out.println(calc.add(10.0, 2));
//		System.out.println(calc.add(10.0, 2.0));
		System.out.println(calc.div(10, 0));	
		
	}
}
//System.out.println(calc.div(10, 2));
//System.out.println(calc.add(2, 1));
//System.out.println(calc.div(10, 2));
//System.out.println(calc.add(10.0, 2));
//System.out.println(calc.add(10.0, 2.0));
//Calc calc2 = ctx.getBean("calcImpl2", Calc.class);		
//System.out.printf("%s : %d",calc2, calc2.add(2, 1));