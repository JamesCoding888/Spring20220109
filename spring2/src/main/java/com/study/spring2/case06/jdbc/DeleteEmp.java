package com.study.spring2.case06.jdbc;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
public class DeleteEmp {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc-config.xml");
		JdbcTemplate jdbcTemplate = ctx.getBean("jdbcTemplate", JdbcTemplate.class);
		int id = 1;
		String sql = "delete from emp where eid=?";
		int rowcount = jdbcTemplate.update(sql, id);
		System.out.println("Delete rowcount: " + rowcount);
	}	
}
