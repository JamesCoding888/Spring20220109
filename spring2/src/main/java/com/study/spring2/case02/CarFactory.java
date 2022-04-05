package com.study.spring2.case02;
import java.util.Random; 
import org.springframework.beans.factory.FactoryBean;
public class CarFactory implements FactoryBean<Car> {		
	public CarFactory() {
		System.out.println("CarFactory Constructor");
		System.out.println(super.toString());				
	}
	public void init() {
		System.out.println("CarFactory init");
	}
	public void destroy() {
		System.out.println("CarFactory destroy");
	}
	@Override
	public Car getObject() throws Exception {
		Car car = new Car();
		car.setName("BMW");
		car.setPrice(150_000 + new Random().nextInt(100_0000));
		return car;
	}
	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;
	}	
}
