package com.study.spring2.case02;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainTest3 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext2.xml");
		Teacher s4 = (Teacher)ctx.getBean("teacher");
		System.out.println("================================================================================================================");
		System.out.println(s4);
		System.out.println("================================================================================================================");
		System.out.println("Acquire the total number of students:" + s4.getStudentOfClazzs().size()); 	
		System.out.println("Acquire the total credits of all students:" + s4.getTotalCredits());
		Teacher s5 = (Teacher)ctx.getBean("teacher2");
		System.out.println("================================================================================================================");
		System.out.println(s5);
		System.out.println("================================================================================================================");
		((ClassPathXmlApplicationContext)ctx).close();
	}
}
