package com.study.spring2.case06.tx.dao;
import com.study.spring2.case06.tx.exception.InsufficientAmount; 
import com.study.spring2.case06.tx.exception.InsufficientQuantity;

public interface BookDaoException {
	Integer getPrice(Integer bid);
	Integer updateStock(Integer bid) throws InsufficientQuantity; 
	Integer updateWallet(Integer wid, Integer money) throws InsufficientAmount; // 扣掉金額
}
