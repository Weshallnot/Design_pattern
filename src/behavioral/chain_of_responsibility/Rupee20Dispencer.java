package com.pattern.behavioral.chain_of_responsibility;

public class Rupee20Dispencer implements DispenseChain{
	private DispenseChain chain;

	@Override
	public void setNextDispenseChain(DispenseChain nextChain) {
		this.chain = nextChain;
	}

	@Override
	public void dispense(Rupay ru) {
		
		if(ru.getAmount() >= 20) {
			
			int num = ru.getAmount() / 20;
			int remainder = ru.getAmount() % 20;
			
			System.out.println("Dispencing " + num + " 20₹ note");
			if( remainder != 0)
				this.chain.dispense(new Rupay(remainder));
		}
		else
			this.chain.dispense(ru);
	}
}
