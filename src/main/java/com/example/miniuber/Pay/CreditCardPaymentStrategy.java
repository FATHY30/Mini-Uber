package com.example.miniuber.Pay;

public class CreditCardPaymentStrategy implements PaymentStrategy {
	
	private String cardNumber;
    private String name;
    private String date;
    private String cvv;
    public CreditCardPaymentStrategy(String cardNumber, String name, String date, String cvv) {
        this.cardNumber = cardNumber;
        this.name = name;
        this.date = date;
        this.cvv = cvv;
    }

	@Override
	public void pay(int amount) {
		
		System.out.println("Paid $" + amount + " via Credit Card.");
		
	}
	
	
}
