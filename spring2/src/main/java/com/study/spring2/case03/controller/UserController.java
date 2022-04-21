package com.study.spring2.case03.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.study.spring2.case03.service.UserService;
import com.study.spring2.case03.service.UserServiceImpl;
@Controller
public class UserController {
//	private UserService userService = new UserServiceImpl(); 
	
	@Autowired(required = false) // @Autowired 預設是 @Autowired(required = true)  
	private UserService userService;
	public UserController() {
		System.out.println("UserController");
	}
	// 當 @Autowired(required = false)，須加上判斷 if，避免 Spring 在找不到匹配 Bean 時不報錯
	public void appendUser() {
		if(userService != null) {    
			userService.addUser();					
		}		
	}
}
