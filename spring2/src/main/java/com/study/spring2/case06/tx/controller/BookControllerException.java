package com.study.spring2.case06.tx.controller;

public interface BookControllerException {
	public void buyBook(Integer wid, Integer bid);
	public void buyBooks(Integer wid, Integer... bid);
}
