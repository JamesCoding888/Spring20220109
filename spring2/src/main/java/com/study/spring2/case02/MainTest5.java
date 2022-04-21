package com.study.spring2.case02;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainTest5 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext2.xml");
		Color c1 = (Color)ctx.getBean("color");
		Color c2 = (Color)ctx.getBean("red");
//		Size  s1 = (Size)ctx.getBean("size");
		Size  s2 = (Size)ctx.getBean("b5");
//		Paper p1 = (Paper)ctx.getBean("paper1");		
		Paper p2 = (Paper)ctx.getBean("paper2");		
//		Paper p3 = (Paper)ctx.getBean("paper3");
		Paper p4 = (Paper)ctx.getBean("paper4");
		System.out.println("<!-- 手動配置 (字面值得配置) -->");
		System.out.println(c1);
		System.out.println(c2);
//		System.out.println(s1);
		System.out.println(s2);	
//		System.out.println(p1);
		System.out.println("<!-- 自動配置 autowire=\"constructor\" / schema-c -->");
		System.out.println(p2);
//		System.out.println("<!-- 自動配置 autowire=\"byType\" / schema-p -->");
//		System.out.println(p3);
		System.out.println("<!-- 自動配置 autowire=\"byName\" / schema-p -->");
		System.out.println(p4);
	}
}