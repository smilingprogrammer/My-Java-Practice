package com.company.polymorphism;

public class Apple extends Fruit{

    @Override
    public void makeJuice() {
        System.out.println("Apple Juice was made here");
    }

    public void removeSeeds(){
        System.out.println("remove apple seeds");
    }

    @Override
    public void setCalories(String calories) {
        System.out.println("Calories of apple is " + calories);
    }
}
