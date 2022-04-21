package com.study.spring2.case03.service;
import java.util.Date;  
import org.springframework.stereotype.Component;
@Component // 對於一般的 bean 不是 @Controller, @Service, @Respository，無法歸類   
public class Util {
	public Util() {
		System.out.println("Util()");
	}
	public Date getToday() {
		return new Date();
	}
	
}
