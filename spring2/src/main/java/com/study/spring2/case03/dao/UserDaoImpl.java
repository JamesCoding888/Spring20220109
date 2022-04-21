package com.study.spring2.case03.dao;
import org.springframework.stereotype.Repository;
@Repository
public class UserDaoImpl implements UserDao {
	public UserDaoImpl() {
		System.out.println("UserDaoImpl");
	}
	@Override
	public void createUser() {
		System.out.println("Create user ok!");		
	}	
}
