package com.pattern.structural.proxy;

public class CommandExecutorProxy implements CommandExecutor {
	
	private boolean isAdmin = false;
	private CommandExecutor commandExecutor;
	
	public CommandExecutorProxy(String user, String pwd) {
		if("bhaskar".equals(user) && "1234".equals(pwd))
			isAdmin = true;
		commandExecutor = new CommandExecutorImpl();
	}

	@Override
	public void runCommand(String cmd) throws Exception {
		if(isAdmin) {
			commandExecutor.runCommand(cmd);
		} else {
			if(cmd.trim().startsWith("del")) {
				throw new Exception("del command is not allowed for non-admin");
			}
			else commandExecutor.runCommand(cmd);
		}
	}

}
