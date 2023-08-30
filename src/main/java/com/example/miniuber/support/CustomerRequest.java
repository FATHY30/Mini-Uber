package com.example.miniuber.support;

public class CustomerRequest {

    private Request type;
    private boolean isOpen;
    private String description;

    public CustomerRequest(Request typeRequest, String description) {
        this.description = description;
        isOpen=true;
        type=typeRequest;
    }
    public void handleRequest() {
        type.handle(this);
    }
    public void setState(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public Request getRequestType() {
        return type;
    }

    public String getDescription() {
        return description;
    }
}
