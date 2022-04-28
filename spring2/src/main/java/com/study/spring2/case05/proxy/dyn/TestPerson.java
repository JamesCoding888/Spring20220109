package com.study.spring2.case05.proxy.dyn;

public class TestPerson {

	public static void main(String[] args) {
		Person man = (Person)new ProxyUtil(new Man()).getProxy();
		man.work();
		Person woman = (Person)new ProxyUtil(new Woman()).getProxy();
		woman.work();
	}
}
