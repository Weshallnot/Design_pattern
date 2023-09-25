package com.pattern.behavioral.strategy;

public class ShoppingCartTest {
	
	public static void main(String[] args) {
		
		ShoppingCart cart = new ShoppingCart();
		
		Item item1 = new Item("1234", 90);
		Item item2 = new Item("1235", 121);
		
		cart.addItem(item1);
		cart.addItem(item2);
		
		cart.pay(new Paypal("chauhanbhaskar@gmail.com", "#bhaskar*22131"));
		
		cart.pay(new CreditCard("bhaskar", "4321567834567890", "335", "2025-06-06"));
	}
}
