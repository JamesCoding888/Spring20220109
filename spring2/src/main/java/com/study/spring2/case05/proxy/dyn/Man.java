package com.study.spring2.case05.proxy.dyn;
public class Man implements Person {
	@Override
	public void work() {
		System.out.println("戴口罩");
		System.out.println("上班工作");
		System.out.println("脫口罩");
	}
}
