package com.example.miniuber.Controller;

public class PaymentModel {
    private String email;
    private String dest;
    private String type;
    private int price;

    public PaymentModel(String email, String dest, String type, int price) {
        this.email = email;
        this.dest = dest;
        this.type = type;
        this.price = price;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
