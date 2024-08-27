package com.gymManagementSystem.service;

import com.gymManagementSystem.model.Subscription;

import java.util.List;

public class SubscriptionService implements SubscriptionServiceInterface {

    private List<Subscription> subscriptions;

    public SubscriptionService(List<Subscription> subscriptions) {
        this.subscriptions = subscriptions;
    }

    @Override
    public void addSubscription(Subscription subscription) {
        subscriptions.add(subscription);
    }

    @Override
    public void removeSubscription(Subscription subscription) {
      subscriptions.remove(subscription);
    }
}
