package com.pattern.creational.factory;

public class TestFactory {
	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer(Type.PC, "8 GB", "256 GB", "2.4 GHz");
		Computer server = ComputerFactory.getComputer(Type.SERVER, "8 GB", "256 GB", "2.4 GHz");
		
		System.out.println(pc);
		System.out.println(server);
	}
}
