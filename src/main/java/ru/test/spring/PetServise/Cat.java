package ru.test.spring.PetServise;

public class Cat extends Pet{

    private String nameCat;
    private Toy toy;

    public Cat(Toy toy) {
        this.toy = toy;
    }

    @Override
    public void getVoice(){
        System.out.println("I am cat. Mya miauw");
    }

    @Override
    public void getToy() {
        System.out.println("I am cat's toy - " + toy.getName());
    }
}
