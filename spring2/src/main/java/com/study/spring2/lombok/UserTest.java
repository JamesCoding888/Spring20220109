package com.study.spring2.lombok;
public class UserTest {
	public static void main(String[] args) {
		User user = new User();
		user.setName("Vincent");
		System.out.println(user.getName());
		user.setAge(18);
		System.out.println(user.getAge());
		System.out.println(user);
		User user2 = new User("Anita", 19);
		System.out.println(user2);
	}
}