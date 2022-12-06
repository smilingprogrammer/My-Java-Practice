package com.company.abstractandinterface;

public class Farm {

    public static void main(String[] args){

        Animal animal = new Pig();
        animal.makeSound();
        animal.eat();

        animal = new Duck();
        animal.eat();
        animal.makeSound();
    }
}
