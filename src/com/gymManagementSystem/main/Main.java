package com.gymManagementSystem.main;


import com.gymManagementSystem.model.Client;
import com.gymManagementSystem.model.Gym;
import com.gymManagementSystem.model.Subscription;
import com.gymManagementSystem.model.Trainer;
import com.gymManagementSystem.repository.GymRepository;
import com.gymManagementSystem.service.GymService;
import com.gymManagementSystem.service.GymServiceInterface;
import com.gymManagementSystem.service.SubscriptionService;
import com.gymManagementSystem.service.SubscriptionServiceInterface;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Gym gym = new Gym();
        GymRepository gymRepository = new GymRepository(gym);

        GymServiceInterface gymService = new GymService(gymRepository);

        SubscriptionServiceInterface subscriptionService = new SubscriptionService(new ArrayList<>());


        Trainer trainer1 = new Trainer();
        trainer1.setName("Marcel");
        trainer1.setSpecializare("fitness");

        Trainer trainer2 = new Trainer();
        trainer2.setName("Maia");
        trainer2.setSpecializare("aerobic");

        gymService.addTrainer(trainer1);
        gymService.addTrainer(trainer2);

        Subscription subscription1 = new Subscription();
        subscription1.setType("lunar");
        subscription1.setPrice(145.50);

        Subscription subscription2 = new Subscription();
        subscription2.setType("anual");
        subscription2.setPrice(1200.50);

        Client client1 = new Client();
        client1.setName("Ioana Pop");
        client1.setSubscription(subscription1);

        Client client2 = new Client();
        client2.setName("Maria");
        client2.setSubscription(subscription2);

        gymService.addClient(client1);
        gymService.addClient(client2);

        System.out.println("Numarul de traineri: "+gym.getTrainers().size());
        System.out.println("Lista trainerilor din sala este urmatoarea: ");
        for(Trainer trainer : gym.getTrainers()){
            System.out.println(trainer);
        }

        System.out.println("Lista clientilor din sale este: ");
        for (Client client : gym.getClients()){
            System.out.println(client);
        }

        System.out.println("Numarul total al clientilor inregistrati este: "+gym.getClients().size());
    }
}