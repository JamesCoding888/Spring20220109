package com.study.spring2.case05_2.aop_changeCarrer;
import org.springframework.context.ApplicationContext;    
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
	public static void main(String[] args) {
		// Java 配置
//		ApplicationContext ctx = new AnnotationConfigApplicationContext(AOPConfigCarrer.class);
		// aop-dancer.xml 配置
		ApplicationContext ctx = new ClassPathXmlApplicationContext("aop-dancer.xml");
		Performance performance = ctx.getBean("dancer", Performance.class);
		System.out.println(performance); // 確認 bean 的記憶體來至 Dancer
		try {
			performance.perform();	
		} catch (Exception e) {
			System.out.println(e);
			// 轉換跑道
			// 舞者轉唱歌
			Singer singer = (Singer) performance;
			Actor actor = (Actor) performance;
			singer.sing();
			actor.show();
		}				
	}	
}