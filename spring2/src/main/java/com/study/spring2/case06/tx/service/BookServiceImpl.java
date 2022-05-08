package com.study.spring2.case06.tx.service;
import org.springframework.beans.factory.annotation.Autowired;    
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.study.spring2.case06.tx.dao.BookDao;
@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookDao bookDao;
	
	@Transactional(propagation = Propagation.REQUIRED, // default 可寫可不寫
				   timeout = 3 // 交易時間限制 3 秒須完成
				  )
	@Override
	public void buyOne(Integer wid, Integer bid) {
		
		try {
			
			int price = bookDao.getPrice(bid);
			Thread.sleep(5000);       // 假設交易停留 5 秒
			bookDao.updateStock(bid); // 減去庫存
			// 製造一個商業邏輯的錯誤
//			System.out.println(10/0);
			bookDao.updateWallet(wid, price); // 錢包減去的金額

		} catch (Exception e) {
			// TODO: handle exception
		}
				
	}
	@Override
	public void buyMany(Integer wid, Integer... bid) {
		// TODO Auto-generated method stub

	}
}
