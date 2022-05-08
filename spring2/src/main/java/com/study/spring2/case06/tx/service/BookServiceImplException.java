package com.study.spring2.case06.tx.service;
import org.springframework.beans.factory.annotation.Autowired;      
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.study.spring2.case06.tx.dao.BookDaoException;
import com.study.spring2.case06.tx.exception.InsufficientAmount;
import com.study.spring2.case06.tx.exception.InsufficientQuantity;
@Service
public class BookServiceImplException implements BookServiceException{
	
	@Autowired
	private BookDaoException bookDaoException;
	
	@Transactional(propagation = Propagation.REQUIRED, // default 可寫可不寫				   				   
				   rollbackFor = {InsufficientQuantity.class},
				   noRollbackFor = {InsufficientAmount.class, RuntimeException.class}
				  )
	@Override
	public void buyOne(Integer wid, Integer bid) throws InsufficientAmount, InsufficientQuantity{		
			int price = bookDaoException.getPrice(bid);			
			bookDaoException.updateStock(bid); // 減去庫存
			// 製造一個商業邏輯的錯誤
//			System.out.println(10/0);
			bookDaoException.updateWallet(wid, price); // 錢包減去的金額				
	}
	@Transactional
	@Override
	public void buyMany(Integer wid, Integer... bids) throws InsufficientAmount, InsufficientQuantity {
		for(int bid: bids) {
			buyOne(wid, bid);
		}
	}
}
