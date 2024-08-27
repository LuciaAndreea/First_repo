package com.gymManagementSystem.model;

public class Client extends Person{

    private Subscription subscription;

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    @Override
    public String toString() {
        return "Client: " +getName()+
                " are urmatoarul abonament: " + subscription.getType();
    }
}
