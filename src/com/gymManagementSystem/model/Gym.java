package com.gymManagementSystem.model;

import java.util.ArrayList;
import java.util.List;

public class Gym {
    private List<Trainer> trainers;
    private List<Client> clients;

    public Gym() {
        this.trainers = new ArrayList<>();
        this.clients = new ArrayList<>();
    }

    public List<Trainer> getTrainers() {
        return trainers;
    }

    public void setTrainers(List<Trainer> trainers) {
        this.trainers = trainers;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
}
