package com.study.spring2.case04.dao;
import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.study.spring2.case04.model.JsonDb;
import com.study.spring2.case04.model.Person;
@Repository
public class PersonDaoImpl implements PersonDao {
	@Autowired
	private JsonDb jsonDb;
	
	@Override
	public boolean add(Person person) {
		try {
			jsonDb.add(person);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;	
	}

	@Override
	public List<Person> queryAll() {
		try {
			return jsonDb.queryAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
