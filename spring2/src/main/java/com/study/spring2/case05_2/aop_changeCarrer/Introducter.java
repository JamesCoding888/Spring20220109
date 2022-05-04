package com.study.spring2.case05_2.aop_changeCarrer;
import org.aspectj.lang.annotation.Aspect;  
import org.aspectj.lang.annotation.DeclareParents;
@Aspect
public class Introducter { // 經紀人
	// 將 Performance 及其子類別轉換為 Singer
	@DeclareParents	(value = "com.study.spring2.case05_2.aop_changeCarrer.Performance+",
					 defaultImpl = BackSinger.class)
	public Singer singer;

	// 將 Performance 及其子類別轉換為 Actor
	@DeclareParents	(value = "com.study.spring2.case05_2.aop_changeCarrer.Performance+",
			 defaultImpl = TalkActor.class)
	public Actor actor;
}
