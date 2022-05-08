package com.study.spring2.case06.tx;
import org.springframework.context.ApplicationContext;       
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import com.study.spring2.case06.tx.controller.BookControllerException;
public class BuyBookException {
	public static void main(String[] args) {
		// [{wid=1, money=100}]
		// [{sid=1, bid=1, amount=3}]
		// Wallet 1 要買 Book 1 ($80)
		// [{wid=1, money=20}]
		// [{sid=1, bid=1, amount=2}]
		ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc-config.xml");
		JdbcTemplate jdbcTemplate = ctx.getBean("jdbcTemplate", JdbcTemplate.class);	
		BookControllerException bookControllerException = ctx.getBean("bookControllerImplException", BookControllerException.class);
		int wid = 1;
		int bid = 1;
		bookControllerException.buyBook(wid, bid);
	}
}
