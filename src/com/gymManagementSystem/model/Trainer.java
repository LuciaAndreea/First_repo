package com.gymManagementSystem.model;

public class Trainer extends Person {

    private String specializare;

    public String getSpecializare() {
        return specializare;
    }

    public void setSpecializare(String specializare) {
        this.specializare = specializare;
    }

    @Override
    public String toString() {
        return "Trainer: {" + getName()+
                " are specializare: '" + specializare + '\'' +
                '}';
    }
}
