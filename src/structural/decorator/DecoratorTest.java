package com.pattern.structural.decorator;

public class DecoratorTest {
	public static void main(String[] args) {
		
		Car sportsCar = new SportsCar(new BasicCar());
		sportsCar.assembel();
	}
}
