package com.gymManagementSystem.model;

public class Subscription {
    private String type;
    private double price;


    public Subscription(){

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
