package ru.test.spring.PetServise;

import org.springframework.beans.factory.annotation.Autowired;

public class MessageService {

    public void messageBefore() {
        System.out.println("I am before!");
    }

    public void messageAfter(){
        System.out.println("I am after!");
    }
}
