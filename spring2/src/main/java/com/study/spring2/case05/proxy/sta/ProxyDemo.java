package com.study.spring2.case05.proxy.sta;
public class ProxyDemo{
	public static void main(String[] args) {
		// 不透過代理，直接執行
		/*
		Person p1 = new Man();
		Person p2 = new Woman();
		p1.work();
		p2.work();
		*/

		// 透過代理，將業務方法與公用方法分開
		// 更用彈性，當某一天不需要公用方法時，只需修改公用方法	
		Person personProxy1 = new PersonProxy(new Man());
		Person personProxy2 = new PersonProxy(new Woman());
		personProxy1.work();
		personProxy2.work();
	}
}
