package com.study.spring2.case05;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
			return new ArrayList<Person>();
		}
		return people;
	}

}
