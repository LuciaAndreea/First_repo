package com.gymManagementSystem.repository;

import com.gymManagementSystem.model.Client;
import com.gymManagementSystem.model.Gym;
import com.gymManagementSystem.model.Trainer;

import java.util.List;

public class GymRepository {

    private Gym gym;

    public GymRepository(Gym gym) {
        this.gym = gym;
    }

    public void addTrainer(Trainer trainer){
        gym.getTrainers().add(trainer);
    }

    public void removeTrainer(Trainer trainer){
        gym.getTrainers().remove(trainer);
    }

    public List<Trainer> getAllTrainers(){
        return gym.getTrainers();
    }

    public void addClient(Client client){
        gym.getClients().add(client);
    }

    public void removeClient(Client client){
        gym.getClients().remove(client);
    }

    public List<Client> getAllClients(){
        return gym.getClients();
    }
}
