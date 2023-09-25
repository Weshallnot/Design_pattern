package com.pattern.structural.decorator;

public class CarDecorator implements Car{

	protected Car car;
	
	public CarDecorator(Car car) {
		this.car = car;
	}
	
	@Override
	public void assembel() {
		System.out.println("Car Decorator");
		this.car.assembel();
	}

}
