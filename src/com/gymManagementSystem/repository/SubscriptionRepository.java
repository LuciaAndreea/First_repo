package com.gymManagementSystem.repository;

import com.gymManagementSystem.model.Subscription;

import java.util.ArrayList;
import java.util.List;

public class SubscriptionRepository {
    private List<Subscription> subscriptions = new ArrayList<>();

    public List<Subscription> getSubscriptions(){
        return subscriptions;
    }
}
