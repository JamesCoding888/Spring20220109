package com.study.spring2.case06.tx.dao;
import org.springframework.beans.factory.annotation.Autowired;   
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.study.spring2.case06.tx.exception.InsufficientAmount;
import com.study.spring2.case06.tx.exception.InsufficientQuantity;
@Repository
public class BookDaoImplException implements BookDaoException {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public Integer getPrice(Integer bid) {
		String sql = "select price from book where bid=?";
		Object[] args = new Object[] {bid};		
		return jdbcTemplate.queryForObject(sql, args, Integer.class);
	}

	@Override
	public Integer updateStock(Integer bid) throws InsufficientQuantity {
		
		// 庫存減 1
		/*****************************************************************
		String sql = "update stock set amount = amount - 1 where bid=?";				
		Object[] args = new Object[] {bid};		
		return jdbcTemplate.update(sql, args);
		******************************************************************/
		// 檢查庫存
//		/******************************************************************
		String sql = "select amount from stock where bid=?";
		Object[] args = new Object[] {bid};		
		int amount = jdbcTemplate.queryForObject(sql, args, Integer.class);
		if(amount<=0) {
			throw new InsufficientQuantity();
		}
		// 修改庫存
		sql = "update stock set amount = amount - 1 where bid=?";
		return jdbcTemplate.update(sql, args);
//		*******************************************************************/
	}

	@Override
	public Integer updateWallet(Integer wid, Integer money) throws InsufficientAmount {
		// 減去總金額
		/******************************************************************
		String sql = "update wallet set money = money - ? where wid=?";		
		Object[] args = new Object[] {money, wid};		
		return jdbcTemplate.update(sql, args);
		*******************************************************************/
		// 檢查餘額是否不足
//		/******************************************************************
		String sql = "select money from wallet where wid=?";		
		Object[] args = new Object[] {wid};
		int walletMoney = jdbcTemplate.queryForObject(sql, args, Integer.class);
		if(walletMoney < money) {
			throw new InsufficientAmount();
		}
		// 修改餘額
		sql = "update wallet set money = money - ? where wid=?";
		args = new Object[] {money, wid};
		return jdbcTemplate.update(sql, args);
//		******************************************************************/
	}
}
