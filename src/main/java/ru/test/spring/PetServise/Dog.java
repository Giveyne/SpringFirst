package ru.test.spring.PetServise;

public class Dog extends Pet{

    private String nameDog;

    public Dog() {
    }

    @Override
    public void getVoice(){
        System.out.println("I am dog. Gau gaw");
    }

}
