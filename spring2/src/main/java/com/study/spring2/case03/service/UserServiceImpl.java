package com.study.spring2.case03.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.study.spring2.case03.dao.UserDao;
import com.study.spring2.case03.dao.UserDaoImpl;
@Service
public class UserServiceImpl implements UserService{
//	private UserDao userDao = new UserDaoImpl();
	
	// 自動裝配的順序 byType 在進行 byName	
	@Autowired(required = true)
	@Qualifier(value = "userDaoImpl")
	private UserDao userDao;
	
	public UserServiceImpl() {
		System.out.println("UserServiceImpl");
	}
	
	@Override
	public void addUser() {	
			userDao.createUser();				
	}	
}
