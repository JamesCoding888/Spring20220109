package com.study.spring2.case05;

import java.util.List;

public interface PersonDao {
	public boolean add(Person person);
	
	public List<Person> queryAll();
}
