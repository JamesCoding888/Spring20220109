package com.study.spring2.case05.aop_dancer;
import org.aspectj.lang.annotation.After; 
import org.aspectj.lang.annotation.Aspect;
@Aspect
public class DancerWalk {
	// 切面表達式可以指向 interface 
	@After("execution(public void com.study.spring2.case05.aop_dancer.Performance.perform(..))")
	public void dancerWalk() {
		System.out.println("後置通知 - 走下階梯");
	}
}
