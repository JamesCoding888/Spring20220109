package com.study.spring2.case04.service;
import java.util.ArrayList;  
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.study.spring2.case04.dao.PersonDao;
import com.study.spring2.case04.model.Person;

@Service
public class PersonServiceImpl implements PersonService{
	@Autowired
	private PersonDao personDao;
	
	@Override
	public boolean append(Person person) {
		if(person != null) {
			personDao.add(person);
			return true;
		}
		return false;
	}

	@Override
	public List<Person> findAll() {
		List<Person> people = personDao.queryAll();
		if(people == null) {
			return new ArrayList<Person>(); // 如果 person = null 就不需要由前端處理，可由後端service 處理
		}
		return people;
	}

}
