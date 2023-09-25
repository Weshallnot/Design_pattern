package com.pattern.creational.factory;

// Factory Design Pattern Sub Class
public class PC extends Computer {
	
	private String ram;
	private String hdd;
	private String cpu;

	public PC(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public String getRAM() {
		return ram;
	}

	@Override
	public String getHHD() {
		return hdd;
	}

	@Override
	public String getCPU() {
		return cpu;
	}

}
