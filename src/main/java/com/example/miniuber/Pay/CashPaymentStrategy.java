package com.example.miniuber.Pay;

public class CashPaymentStrategy implements PaymentStrategy {
	@Override
	public void pay(int amount) {
		 System.out.println("Paid $" + amount + " in cash.");
	}



}
