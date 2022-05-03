package com.study.spring2.case05.aop;
import java.util.Arrays;       
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component
@Aspect // 切面
@Order(1) // 數字越小越先被執行(預設 order 的數值是 int 的最大值)
public class MyLoggerAspect {
	// Pointcut
	@Pointcut(value = "execution(public int com.study.spring2.case05.aop.CalcImpl.add(int, int))")	
	public void pt1() {}
	@Pointcut(value = "execution(public int com.study.spring2.case05.aop.CalcImpl2.add(..))")
	public void pt2() {}
	@Pointcut(value = "execution(public int com.study.spring2.case05.aop.CalcImpl.*(..))")
	public void pt3() {}
	@Pointcut(value = "execution(* com.study.spring2.case05.aop.CalcImpl.*(..))")
	public void pt4() {}
	@Pointcut(value = "execution(* com.study.spring2.case05.aop.CalcImpl.*.*(..))")
	public void pt5() {}
	@Pointcut(value = "execution(* *.*(..))")
	public void pt6() {}		
	@Pointcut(value = "execution(public int com.study.spring2.case05.aop.CalcImpl.div(int, int))")	
	public void pt7() {}
	@Pointcut(value = "execution(public int com.study.spring2.case05.aop.CalcImpl.div(int, int))")	
	public void pt8() {}
	@Pointcut(value = "execution(public Integer com.study.spring2.case05.aop.CalcImpl.add(Integer, Integer))")	
	public void pt9() {}
	@Pointcut(value = "execution(public Integer com.study.spring2.case05.aop.CalcImpl.div(Integer, Integer))")	
	public void pt10() {}
/*	
	// 前置通知
		@Before(value = "pt1()")
		public void before(JoinPoint joinPoint) {
			System.out.println("前置通知 - ");
			String methodName = joinPoint.getSignature().getName(); // 獲取方法
			Object[] args = joinPoint.getArgs(); // 獲取方法參數
			System.out.printf("方法名稱: %s，方法參數: %s\n", methodName, Arrays.toString(args));		
		}
		
	// 後置通知 (會放在 finally 區段中，所以無論是否會拋出例外都會執行)
	@After(value = "pt8()")
	public void after(JoinPoint joinPoint) {
		System.out.println("後置通知 - ");
		String methodName = joinPoint.getSignature().getName(); // 獲取方法
		Object[] args = joinPoint.getArgs(); // 獲取方法參數
		System.out.printf("方法名稱: %s，方法參數: %s\n", methodName, Arrays.toString(args));		
	}	
	// 返回通知 (可以設定 returning 來接收方法的返回值)
	@AfterReturning(value = "pt1()", returning = "res") // 注意 returning = "參數名稱" 必須與 Object 參數名稱 一致
	public void afterReturningOfpt1(Object res) {
		System.out.println("返回通知 - result: " + res);
	}

	// 返回通知 (可以設定 returning 來接收方法的返回值)
	@AfterReturning(value = "pt8()", returning = "res") // 注意 returning = "參數名稱" 必須與 Object 參數名稱 一致
	public void afterReturning(Object res) {
		System.out.println("返回通知 - result: " + res);
	}
	
	// 異常通知 (可以設定 throwing 異常通知變數)
	@AfterThrowing(value = "pt9()", throwing = "ex")
	public void afterThrowingOfpt9(Exception ex) {
		System.out.println("異常通知 - ex: " + ex);
	}
	// 異常通知 (可以設定 throwing 異常通知變數)
	@AfterThrowing(value = "pt10()", throwing = "ex")
	public void afterThrowingOfpt10(Exception ex) {
		System.out.println("異常通知 - ex: " + ex);
	}
*/	
	// 環繞通知
	@Around(value = "pt10()")
	public Object around(ProceedingJoinPoint joinPoint) {
		Object result = null;
		try {
			// 1. 前置通知
			System.out.println("環繞通知 - 前置通知");
			/* 
			   joinPoint.proceed() 須備 Throwable 抓
			   Object org.aspectj.lang.ProceedingJoinPoint.proceed() throws Throwable			   
			 */
			result = joinPoint.proceed(); // 執行業務邏輯的方法			
			// 2. 返回通知
			System.out.println("環繞通知 - 返回通知");
		} catch(Throwable e) {
			
			// 3. 異常通知
			System.out.println("環繞通知 - 異常通知 : " + e);
			
		} finally {
			// 4. 後置通知
			System.out.println("環繞通知 - 後置通知");
		}
		return result;
	}
}



//前置通知
//@Before(value = "pt1()")
//@Before(value = "pt2()")
//@Before(value = "pt3()")
//@Before(value = "pt4()")
//@Before(value = "pt5()")
//@Before(value = "pt6()")

//@Before(value = "execution(public int com.study.spring2.case05.aop.CalcImpl.add(int, int))") // 切入點表達式
//@Before(value = "execution(public int com.study.spring2.case05.aop.CalcImpl.add(..))") // 切入點表達式
//@Before(value = "execution(public int com.study.spring2.case05.aop.CalcImpl.*(..))") // 切入點表達式
//@Before(value = "execution(* com.study.spring2.case05.aop.CalcImpl.*(..))") // 切入點表達式
//@Before(value = "execution(* com.study.spring2.case05.aop.*.*(..))") // 切入點表達式
//@Before(value = "execution(* *.*(..))") // 切入點表達式



