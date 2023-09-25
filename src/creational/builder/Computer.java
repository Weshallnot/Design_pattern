package com.pattern.creational.builder;

public class Computer {
	
	private String ram;
	private String hdd;
	private String cpu;
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;
	
	public String getRam() {
		return ram;
	}
	public String getHdd() {
		return hdd;
	}
	public String getCpu() {
		return cpu;
	}
	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}
	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}
	private Computer(ComputerBuilder builder) {
		this.ram = builder.ram;
		this.cpu = builder.cpu;
		this.hdd = builder.hdd;
		this.isBluetoothEnabled = builder.isBluetoothEnabled;
		this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
	}
	
	@Override
	public String toString() {
		return "Computer [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + ", isGraphicsCardEnabled="
				+ isGraphicsCardEnabled + ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
	}

	// Builder Class
	public static class ComputerBuilder {

		private boolean isGraphicsCardEnabled;
		private boolean isBluetoothEnabled;
		private String hdd;
		private String cpu;
		private String ram;
		public ComputerBuilder() {}
		public ComputerBuilder(boolean isGraphicsCardEnabled, boolean isBluetoothEnabled, String hdd, String cpu,
				String ram) {
			super();
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
			this.isBluetoothEnabled = isBluetoothEnabled;
			this.hdd = hdd;
			this.cpu = cpu;
			this.ram = ram;
		}
		public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
			return this;
		}
		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}
		public ComputerBuilder setHdd(String hdd) {
			this.hdd = hdd;
			return this;
		}
		
		public ComputerBuilder setCpu(String cpu) {
			this.cpu = cpu;
			return this;
		}
		public ComputerBuilder setRam(String ram) {
			this.ram = ram;
			return this;
		}
		
		public Computer build() {
			return new Computer(this);
		}
	}
}
