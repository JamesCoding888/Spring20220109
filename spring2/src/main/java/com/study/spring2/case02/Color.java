package com.study.spring2.case02;
public class Color {
	private Integer id;
	private String name;	
	public Color() {
		super();
		// TODO Auto-generated constructor stub
	}	
	public Color(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
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
		return "Color [id=" + id + ", name=" + name + "]";
	}	
}
