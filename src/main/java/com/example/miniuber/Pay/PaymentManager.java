package com.example.miniuber.Pay;

public class PaymentManager {
	
	private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        try {
            this.paymentStrategy = paymentStrategy;
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public void processPayment(int amount) {
        if (paymentStrategy != null) {
            paymentStrategy.pay(amount);
        } else {
            System.out.println("Please select a payment method.");
        }
    }

}
