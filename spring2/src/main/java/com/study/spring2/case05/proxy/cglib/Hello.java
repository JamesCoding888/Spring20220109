package com.study.spring2.case05.proxy.cglib;
// 方法簽章的意思就是說，當別人去買東西，給你錢，是很正常的行為，不會問別人為什麼給我錢~
// Example: publi String but(String money)
public class Hello {
	public String sayHello(String str) { // 方法簽章 (規格)
		return "Hello" + str;
	}
}
