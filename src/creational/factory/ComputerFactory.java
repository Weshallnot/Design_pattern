package com.pattern.creational.factory;

public class ComputerFactory {
	
	public static Computer getComputer(Type type, String ram, String hdd, String cpu) {
		if(Type.PC != null)
			return new PC(ram, hdd, cpu);
		else if(Type.SERVER != null)
			return new Server(ram, hdd, cpu);
		return null;
	}
}
