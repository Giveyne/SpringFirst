package ru.test.spring.PetServise;

public class Cat extends Pet{

    private Toy toy;
    private String name;
    public Cat(){}
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

    public void setToy(Toy toy) {
        this.toy = toy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
