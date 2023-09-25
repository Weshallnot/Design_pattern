package com.pattern.behavioral.mediator;

public class UserImpl extends User{

	public UserImpl(ChatMediator mediator, String name) {
		super(mediator, name);
	}

	@Override
	public void send(String msg) {
		System.out.println(this.name + "::sending message::" + msg);
		//mediator.sendMessage(msg, new UserImpl(mediator, name));
	}

	@Override
	public void receive(String msg) {
		System.out.println(this.name + "::receiving message::" + msg);
	}

}
