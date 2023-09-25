package com.pattern.behavioral.strategy;

public class Paypal implements PaymentStrategy {

	private String username;
	private String password;
	
	public Paypal(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid using paypal");
	}

}
