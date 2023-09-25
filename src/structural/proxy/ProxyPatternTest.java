package com.pattern.structural.proxy;

public class ProxyPatternTest {
	
	public static void main(String[] args) {
		CommandExecutor executor = new CommandExecutorProxy("bhaskar", "4321");
		
		try {
			executor.runCommand("dir");
			executor.runCommand("del abc.txt");
		}
		catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}
}
