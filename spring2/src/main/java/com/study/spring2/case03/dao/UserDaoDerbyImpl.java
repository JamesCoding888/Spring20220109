package com.study.spring2.case03.dao;
import org.springframework.stereotype.Repository;
@Repository
public class UserDaoDerbyImpl implements UserDao{
	public UserDaoDerbyImpl() {
		System.out.println("UserDaoDerbyImpl");
	}
	@Override
	public void createUser() {
		System.out.println("Create user ok from Derby!");	
		
	}
}
