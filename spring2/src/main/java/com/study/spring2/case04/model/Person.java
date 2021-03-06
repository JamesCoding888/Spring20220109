package com.study.spring2.case04.model;
import java.util.Date;  
import org.springframework.stereotype.Component;
import com.github.javafaker.DateAndTime;
@Component
public class Person {

	public static void main(String[] args) {

		DateAndTime fakeAndTime = new com.github.javafaker.Faker().date();
		System.out.println(fakeAndTime);
	}

	private String name;
	
	private Integer age;
	
	private Date birth;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", birth=" + birth + "]";
	}	
}
