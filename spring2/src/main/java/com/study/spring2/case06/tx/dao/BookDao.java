package com.study.spring2.case06.tx.dao;

public interface BookDao {
	Integer getPrice(Integer bid);
	Integer updateStock(Integer bid); 
	Integer updateWallet(Integer wid, Integer money); // 扣掉金額
}
