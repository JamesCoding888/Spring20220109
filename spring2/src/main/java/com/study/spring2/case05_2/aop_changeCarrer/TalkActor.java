package com.study.spring2.case05_2.aop_changeCarrer;
import org.springframework.stereotype.Component;
@Component
public class TalkActor implements Actor {

	@Override
	public void show() {
		System.out.println("轉職脫口秀...");
		
	}
}
