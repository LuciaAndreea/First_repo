package com.gymManagementSystem.service;

import com.gymManagementSystem.model.Client;
import com.gymManagementSystem.model.Trainer;
import com.gymManagementSystem.repository.GymRepository;

public class GymService implements GymServiceInterface {

    private GymRepository gymRepository;


    public GymService(GymRepository gymRepository) {
        this.gymRepository = gymRepository;
    }

    @Override
    public void addTrainer(Trainer trainer) {
         gymRepository.addTrainer(trainer);
    }

    @Override
    public void addClient(Client client) {
         gymRepository.addClient(client);
    }

    @Override
    public void removeTrainer(Trainer trainer) {
          gymRepository.removeTrainer(trainer);
    }

    @Override
    public void removeClient(Client client) {
            gymRepository.removeClient(client);
    }
}
