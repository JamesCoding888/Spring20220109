package com.study.spring2.case02;
public class Student {
	private Integer id;
	private String name;
	public Student() {
		System.out.println("Student Constructor");
		System.out.println(super.toString());
	}
	
	public void init() {
		System.out.println("Student init");
	}
	public void destroy() {
		System.out.println("Student destroy");
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}	
}
