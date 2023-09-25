package com.pattern.behavioral.chain_of_responsibility;

public interface DispenseChain {
	
	void setNextDispenseChain(DispenseChain nextChain);
	
	void dispense(Rupay ru);
}
