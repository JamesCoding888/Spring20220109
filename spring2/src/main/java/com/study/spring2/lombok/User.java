package com.study.spring2.lombok;
import lombok.AllArgsConstructor;    
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {
	private String name;
	private Integer age;
}