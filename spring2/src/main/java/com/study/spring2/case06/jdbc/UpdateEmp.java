package com.study.spring2.case06.jdbc;
import org.springframework.context.ApplicationContext; 
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
public class UpdateEmp {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc-config.xml");
		JdbcTemplate jdbcTemplate = ctx.getBean("jdbcTemplate", JdbcTemplate.class);
		int id = 1;
		String sql = "update emp set ename=?, age=? where eid=?";
		int rowcount = jdbcTemplate.update(sql, "ladygaga", 27, id); // "anita", 27, id 就是 sql [?] 號的順序
		System.out.println("Update rowcount: " + rowcount);
		
	}	
}
