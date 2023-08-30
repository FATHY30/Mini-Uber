package com.example.miniuber.support;

public class RefundRequest implements Request {
    @Override
    public void handle(CustomerRequest request) {
        System.out.println("Handling refund request: " + request.getDescription());
        request.setState(false);
    }
}
