package com.example.miniuber.support;

import com.example.miniuber.support.CustomerRequest;

public class ComplaintRequest implements Request {
    @Override
    public void handle( CustomerRequest request) {
        System.out.println("Handling complaint request: " + request.getDescription());
        request.setState(false);
    }
}

