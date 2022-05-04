package com.study.spring2.case05_2.aop_changeCarrer;
import org.aspectj.lang.annotation.After;  
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
@Aspect
public class Audience {
	// 切面表達式可以指向 interface 
	@Before("execution(public void com.study.spring2.case05_2.aop_changeCarrer.Performance.perform(..))")
	public void muteCellPhone() {
		System.out.println("前置通知 - 關掉手機");
	}
	@Before("execution(public void com.study.spring2.case05_2.aop_changeCarrer.Performance.perform(..))")
	public void haveSeats() {
		System.out.println("前置通知 - 找到座位");
	}
	@AfterReturning("execution(public void com.study.spring2.case05_2.aop_changeCarrer.Performance.perform(..))")
	public void applause() {
		System.out.println("返回通知 - 拍手鼓掌");
	}
	@AfterThrowing("execution(public void com.study.spring2.case05_2.aop_changeCarrer.Performance.perform(..))")
	public void demandRefund() {
		System.out.println("異常通知 - 退票! 退票!");
	}
	@After("execution(public void com.study.spring2.case05_2.aop_changeCarrer.Performance.perform(..))")
	public void exit() {
		System.out.println("後置通知 - 離開表演場");
	}
}
