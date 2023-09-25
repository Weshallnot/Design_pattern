package com.pattern.creational.factory.abstractF;

public class TestFactory {
	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer(new PCFactory("12 GB", "1 TB", "3.4 GHz"));
		Computer server = ComputerFactory.getComputer(new ServerFactory("32 GB", "2 TB", "3.4 GHz"));
		
		System.out.println(pc);
		System.out.println(server);
	}
}
