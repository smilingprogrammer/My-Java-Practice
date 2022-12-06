package com.company.polymorphism;

public class Market {

    public static void main(String[] args){

        Fruit fruit = new Apple();
        fruit.makeJuice();
        ((Apple) fruit).removeSeeds();
        fruit.setCalories("500cal");
        fruit.getCalories();

        fruit = new Banana();
        fruit.makeJuice();
        ((Banana) fruit).peel();
        fruit.setCalories("300cal");
        fruit.getCalories();
    }
}
