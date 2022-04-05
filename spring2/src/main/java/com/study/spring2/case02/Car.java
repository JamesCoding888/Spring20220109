package com.study.spring2.case02;
public class Car {
	private String name;
	private Integer price;		
	public Car() {
		System.out.println("Car Constructor");
		System.out.println(super.toString());				
	}
	public void init() {
		System.out.println("Car init");
	}	
	public void destroy() {
		System.out.println("Car destroy");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + "]";
	}	
}
