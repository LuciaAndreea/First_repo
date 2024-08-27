package com.gymManagementSystem.service;

import com.gymManagementSystem.model.Subscription;

public interface SubscriptionServiceInterface {

    void addSubscription(Subscription subscription);

    void removeSubscription(Subscription subscription);
}
