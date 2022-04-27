package com.study.spring2.case04.controller;
import java.util.Date; 
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.study.spring2.case04.model.Person;
import com.study.spring2.case04.service.PersonService;
import com.study.spring2.case04.service.PersonServiceImpl;

@Controller
public class PersonController {
	@Autowired
	private PersonService personService;
	
	public boolean addPerson(String name, Date birth) {
		Person person = new Person();
		person.setName(name);
		// homework: 請計算 age (today - birth) 取 year
		person.setAge(0);
		person.setBirth(birth);
		return personService.append(person);
	}
	
	public List<Person> queryPerson(){
		return personService.findAll();
	}
	
	
}
