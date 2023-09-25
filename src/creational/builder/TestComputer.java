package com.pattern.creational.builder;

public class TestComputer {
	public static void main(String[] args) {
		Computer computer = new Computer.ComputerBuilder()
				.setRam("12 GB")
				.setHdd("256 GB")
				.setCpu("2.4 GHz")
				.setBluetoothEnabled(true)
				.setGraphicsCardEnabled(false)
				.build();
		System.out.println(computer);
	}
}
