package com.pattern.creational.factory.abstractF;

public class ComputerFactory {
	
	public static Computer getComputer(ComputerAbstractFactory computerAbstractFactory) {
		return computerAbstractFactory.createComputer();
	}
}
