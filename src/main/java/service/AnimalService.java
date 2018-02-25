package service;

import domain.Animal;

public class AnimalService {
    private Animal animal;

    public AnimalService(Animal animal) {
        this.animal = animal;
    }

    public String moveAnimal() {
        return animal.move();
    }
}
