package com.study.spring2.case05.proxy.cglib;
import java.lang.reflect.Method;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.cglib.proxy.MethodInterceptor;
public class MyMethodInterceptor implements MethodInterceptor {
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("麻煩請出示實聯制");
		return proxy.invokeSuper(obj, args);		
	}

}
