package com.study.spring2.case05.aop;
import org.springframework.stereotype.Component;
@Component
public class CalcImpl implements Calc {
	@Override
	public int add(int x, int y) {
		int result = x + y;		
		return result;
	}
	
//	@Override
//	public int div(int x, int y) {		
//		int result = x / y;		
//		return result;
//	}
//	
	@Override
	public int add(double x, int y) {
		int result = (int)x + y;
		return result;
	}
	public double add(double x, double y) {
		double result = x + y;
		return result;
	}

	@Override
	public Integer add(Integer x, Integer y) {
		int result = x + y;
		return result;
	}
	@Override
	public Integer div(Integer x, Integer y) {
		int result = x / y;
		return result;
	}	
}