package com.study.spring2.case01;
//Husband & Wife - 若為相依關係，切記!!! 不要用精靈實作 Override toString() 避免產生 
//StackOverFlowError
public class Husband {
	private String name;
	private Wife wife;
	public Husband() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Husband(String name) {
		super();
		this.name = name;
	}

	public Husband(String name, Wife wife) {
		super();
		this.name = name;
		this.wife = wife;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Wife getWife() {
		return wife;
	}
	public void setWife(Wife wife) {
		this.wife = wife;
	}
//	@Override
//	public String toString() {
//		return "Husband [name=" + name + ", wife=" + wife + "]";
//	} 	
}
