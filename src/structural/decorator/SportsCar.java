package com.pattern.structural.decorator;

public class SportsCar extends CarDecorator{

	public SportsCar(Car car) {
		super(car);
	}
	
	@Override
	public void assembel() {
		super.assembel();
		System.out.println("Adding features of sports car.");
	}
}
