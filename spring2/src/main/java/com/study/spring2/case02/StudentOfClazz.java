package com.study.spring2.case02;
import java.util.Set;
public class StudentOfClazz {
	private Integer id;
	private String name;
	private Set<Clazz> clazzs;	
	public StudentOfClazz() {
		System.out.println("StudentOfClazz Constructor");
		System.out.println(super.toString());
	}
	
	public void init() {
		System.out.println("StudentOfClazz init");
	}
	public void destroy() {
		System.out.println("StudentOfClazz destroy");
	}
	
	public StudentOfClazz(Integer id, String name, Set<Clazz> clazzs) {
		super();
		this.id = id;
		this.name = name;
		this.clazzs = clazzs;
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

	public Set<Clazz> getClazzs() {
		return clazzs;
	}

	public void setClazzs(Set<Clazz> clazzs) {
		this.clazzs = clazzs;
	}

	@Override
	public String toString() {
		return "StudentClazz [id=" + id + ", name=" + name + ", clazzs=" + clazzs + "]";
	}	
}
