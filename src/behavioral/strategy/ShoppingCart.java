package com.pattern.behavioral.strategy;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ShoppingCart {
	
	private List<Item> items;
	
	public ShoppingCart() {
		items = new LinkedList<>();
	}
	
	public void addItem(Item item) {
		this.items.add(item);
	}
	
	public void removeItem(Item item) {
		this.items.remove(item);
	}
	
	public int calculateTotal() {
		AtomicInteger sum = new AtomicInteger();
		items.stream().forEach(i->{sum.addAndGet(i.getPrice());});
		return sum.get();
	}
	
	public void pay(PaymentStrategy paymentStrategy) {
		int amount = calculateTotal();
		paymentStrategy.pay(amount);
	}
}
