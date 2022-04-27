package com.study.spring2.case05.proxy.sta;
interface Person {
	public void work();	
}
class Man implements Person{
	// 業務方法
	@Override
	public void work() {
		System.out.println("上班工作");	
	}	
}
class Woman implements Person{
	// 業務方法
	@Override
	public void work() {
		System.out.println("去市場買菜");		
	}	
}
// 靜態代理
class PersonProxy implements Person {
	private Person person;
	public PersonProxy(Person person) {
		this.person = person;
	}	
	// 公用方法
	@Override
	public void work() {
		// 前-公用方法
		System.out.println("戴口罩");
		try {
			// 代理調用-業務方法
			person.work();	
		} catch (Exception e) {
			// 例外公用方法
			System.out.println("買口罩");
		}
		// 後-公用方法
		System.out.println("脫口罩");		
	}
}