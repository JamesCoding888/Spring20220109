package com.study.spring2.case05.aop_dancer;
import org.springframework.context.annotation.Bean; 
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
// 使用 Java 配置代替 aop-config.xml
@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class AOPConfig {
	@Bean
	public Audience audience() {
		return new Audience();
	}	
	
	@Bean
	public DancerWalk dancerWalk() { // 對於使用 @EnableAspectJAutoProxy 所要管控的切面方法，其 method 的名稱 dancerWalk(), dancer123()... 不管控
		return new DancerWalk();
	}

	@Bean(name = "dancer") // "dancer" 的名稱需對應 ctx.getBean("dancer");
	public Performance dancer() {
		return new Dancer();
	}	
}
