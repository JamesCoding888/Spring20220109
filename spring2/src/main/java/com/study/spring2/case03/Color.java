package com.study.spring2.case03;
 
import org.springframework.beans.factory.annotation.Value;  
import org.springframework.stereotype.Component;

@Component
public class Color {
	@Value(value = "白")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Color [name=" + name + "]";
	}

}
