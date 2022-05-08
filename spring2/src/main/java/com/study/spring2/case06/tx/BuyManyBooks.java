package com.study.spring2.case06.tx;
import org.springframework.context.ApplicationContext;        
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import com.study.spring2.case06.tx.controller.BookControllerException;
public class BuyManyBooks {
	public static void main(String[] args) {		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc-config.xml");
		JdbcTemplate jdbcTemplate = ctx.getBean("jdbcTemplate", JdbcTemplate.class);	
		BookControllerException bookControllerException = ctx.getBean("bookControllerImplException", BookControllerException.class);
		int wid = 1;
		int bid = 1;
		bookControllerException.buyBooks(wid, bid, bid, bid);
	}
}
