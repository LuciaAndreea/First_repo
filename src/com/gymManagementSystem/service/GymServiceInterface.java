package com.gymManagementSystem.service;

import com.gymManagementSystem.model.Client;
import com.gymManagementSystem.model.Trainer;

public interface GymServiceInterface {
    void addTrainer(Trainer trainer);

    void addClient(Client client);

    void removeTrainer(Trainer trainer);

    void removeClient(Client client);
}
