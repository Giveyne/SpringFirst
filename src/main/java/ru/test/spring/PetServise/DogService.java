package ru.test.spring.PetServise;


public class DogService implements PetService {

    public DogService() {
    }

    public Pet createPet() {
        return new Dog();
    }

}
