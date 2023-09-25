package com.pattern.behavioral.chain_of_responsibility;

import java.util.Scanner;

public class AtmDispenceChain {
	
	private DispenseChain c1;
	
	public AtmDispenceChain() {
		
		// initialize the chain
		this.c1 = new Rupee50Dispencer();
		DispenseChain c2 = new Rupee20Dispencer();
		DispenseChain c3 = new Rupee10Dispencer();
		
		// set the chain of responsibility
		c1.setNextDispenseChain(c2);
		c2.setNextDispenseChain(c3);
	}
	
	public static void main(String[] args) {
		AtmDispenceChain atmDispenceChain = new AtmDispenceChain();
		
		while(true) {
			int amount = 0;
			
			System.out.println("Enter amount to dispence::");
			Scanner input = new Scanner(System.in);
			amount = input.nextInt();
			
			if(amount % 10 != 0) {
				System.out.println("Amount should be in multiple of 10s");
				return;
			}
			
			// process the request
			atmDispenceChain.c1.dispense(new Rupay(amount));
		}
	}
}
