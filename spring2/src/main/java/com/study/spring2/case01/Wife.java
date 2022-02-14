package com.study.spring2.case01;
//Husband & Wife - 若為相依關係，切記!!! 不要用精靈實作 Override toString() 避免產生 
//StackOverFlowError
public class Wife {
	private String name;
	private Husband husband;
	public Wife() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Wife(String name) {
		super();
		this.name = name;
	}

	public Wife(String name, Husband husband) {
		super();
		this.name = name;
		this.husband = husband;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Husband getHusband() {
		return husband;
	}
	public void setHusband(Husband husband) {
		this.husband = husband;
	}
//	@Override
//	public String toString() {
//		return "Wife [name=" + name + ", husband=" + husband + "]";
//	}
}
