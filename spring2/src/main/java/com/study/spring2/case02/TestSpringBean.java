package com.study.spring2.case02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringBean {

	public static void main(String[] args) {
		ApplicationContext b1 = new ClassPathXmlApplicationContext("bean.xml");
//		TestBean testBean1 = (TestBean)b1.getBean("testBean1");
		TestBean testBean1_2nd = b1.getBean(TestBean.class);
//		System.out.println(testBean1);
		System.out.println(testBean1_2nd);
		
		// initialization of id, name, address
//		testBean1.setId(1);
//		testBean1.setName("James");
//		testBean1.setAddress("Shu-lin");
//		System.out.println(testBean1);
//		TestBean testBean2 = (TestBean)b1.getBean("testBean2");
//		System.out.println(testBean2);
//		TestBean testBean3 = (TestBean)b1.getBean("testBean3");
//		System.out.println(testBean3);

		
		
	}

}
