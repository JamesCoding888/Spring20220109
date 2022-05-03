package com.study.spring2.case05.aop;
public interface Calc {
	int add(int x, int y);
//	int div(int x, int y);
	int add(double x, int y);
	public double add(double x, double y);
	public Integer add(Integer x, Integer y);
	public Integer div(Integer x, Integer y);
}