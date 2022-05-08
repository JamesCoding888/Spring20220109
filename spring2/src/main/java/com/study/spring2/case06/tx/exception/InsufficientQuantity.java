package com.study.spring2.case06.tx.exception;
// 庫存數量不足例外
public class InsufficientQuantity extends Throwable {
	public InsufficientQuantity() {		
		super("Stock 書本庫存數量不足");
	}
}
