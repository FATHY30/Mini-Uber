package com.example.miniuber.support;

public class SupportRequest implements Request{
    @Override
    public void handle ( CustomerRequest request ) {
        System.out.println("Handling support request: " + request.getDescription());
        request.setState(false);

    }
}
