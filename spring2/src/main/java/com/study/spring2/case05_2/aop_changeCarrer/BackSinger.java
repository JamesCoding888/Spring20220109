package com.study.spring2.case05_2.aop_changeCarrer;
import org.springframework.stereotype.Component;
@Component
public class BackSinger implements Singer {

	@Override
	public void sing() {
		System.out.println("轉職歌手，拉拉拉~~~");
		
	}	
}
