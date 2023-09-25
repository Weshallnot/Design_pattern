package com.pattern.behavioral.chain_of_responsibility;

public class Rupee10Dispencer implements DispenseChain{
	private DispenseChain chain;

	@Override
	public void setNextDispenseChain(DispenseChain nextChain) {
		this.chain = nextChain;
	}

	@Override
	public void dispense(Rupay ru) {
		
		if(ru.getAmount() >= 10) {
			
			int num = ru.getAmount() / 10;
			int remainder = ru.getAmount() % 10;
			
			System.out.println("Dispencing " + num + " 10₹ note");
			if( remainder != 0)
				this.chain.dispense(new Rupay(remainder));
		}
		else {
			this.chain.dispense(ru);
		}
	}
}
