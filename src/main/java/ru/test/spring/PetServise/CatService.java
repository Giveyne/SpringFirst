package ru.test.spring.PetServise;

public class CatService implements PetService{

    private Toy toy;

    public CatService(Toy toy) {
        this.toy = toy;
    }

    public Pet createPet() {
        Cat cat = new Cat(toy);
        return cat;
    }

}
