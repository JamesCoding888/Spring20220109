package com.study.spring2.case06.tx.service;

public interface BookService {
	public void buyOne(Integer wid, Integer bid);
	
	public void buyMany(Integer wid, Integer... bid);
}
