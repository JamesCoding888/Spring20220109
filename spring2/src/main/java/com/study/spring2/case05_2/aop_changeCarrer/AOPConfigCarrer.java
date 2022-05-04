package com.study.spring2.case05_2.aop_changeCarrer;
import org.springframework.context.annotation.Bean;  
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
//使用 Java 配置代替 aop-config.xml
@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class AOPConfigCarrer {
	@Bean
	public Audience audience() {
		return new Audience();
	}	
	
	@Bean
	public Introducter getIntroducer() {
		return new Introducter();
	}
	
	@Bean(name = "dancer") // "dancer" 的名稱需對應 ctx.getBean("dancer");
	public Performance dancer() {
		return new Dancer();
	}
}
