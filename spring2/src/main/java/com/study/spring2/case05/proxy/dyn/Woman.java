package com.study.spring2.case05.proxy.dyn;
public class Woman implements Person{
	@Override
	public void work() {
		System.out.println("戴口罩");
		System.out.println("去市場買菜");
		System.out.println("脫口罩");		
	}	
}
