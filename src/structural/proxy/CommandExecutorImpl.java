package com.pattern.structural.proxy;

public class CommandExecutorImpl implements CommandExecutor {

	@Override
	public void runCommand(String cmd) throws Exception {
		ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/c", cmd);
		Process process = processBuilder.start();
		int exitCode = process.waitFor();
		System.out.println("'" + cmd + "' command executed with exit code: " + exitCode);
	}

}
