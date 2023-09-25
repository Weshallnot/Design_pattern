package com.pattern.creational.factory;

// Factory Design Pattern Supper Class
public abstract class Computer {
	public abstract String getRAM();
	public abstract String getHHD();
	public abstract String getCPU();
	
	@Override
	public String toString() {
		return "Computer [getRAM()=" + getRAM() + ", getHHD()=" + getHHD() + ", getCPU()=" + getCPU() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
