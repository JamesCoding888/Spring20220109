package com.study.spring2.case06.tx.controller;
import org.springframework.beans.factory.annotation.Autowired;   
import org.springframework.stereotype.Controller;
import com.study.spring2.case06.tx.exception.InsufficientAmount;
import com.study.spring2.case06.tx.exception.InsufficientQuantity;
import com.study.spring2.case06.tx.service.BookServiceException;
@Controller
public class BookControllerImplException implements BookControllerException {
	
	@Autowired
	private BookServiceException bookServiceException;
	
	@Override
	public void buyBook(Integer wid, Integer bid) {
		try {
			bookServiceException.buyOne(wid, bid);
			System.out.println("buyBook ok");	
		} catch (InsufficientAmount | InsufficientQuantity e) {
			System.out.println(e);
		}		
	}
	@Override
	public void buyBooks(Integer wid, Integer... bids) {
		try {
			bookServiceException.buyMany(wid, bids);
		} catch (InsufficientAmount | InsufficientQuantity e) {
			System.out.println(e);
		}	
	}
}
