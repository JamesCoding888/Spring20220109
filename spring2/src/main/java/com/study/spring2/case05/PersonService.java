package com.study.spring2.case05;

import java.util.List;

public interface PersonService {
	boolean append(Person person);
	List<Person> findAll();
}
