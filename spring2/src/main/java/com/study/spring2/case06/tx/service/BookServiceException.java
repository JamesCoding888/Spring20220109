package com.study.spring2.case06.tx.service;

import com.study.spring2.case06.tx.exception.InsufficientAmount; 
import com.study.spring2.case06.tx.exception.InsufficientQuantity;

public interface BookServiceException {
	public void buyOne(Integer wid, Integer bid) throws InsufficientAmount, InsufficientQuantity;
	public void buyMany(Integer wid, Integer... bid) throws InsufficientAmount, InsufficientQuantity;
}
