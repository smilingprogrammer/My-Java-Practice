package com.company.polymorphism;

public class Apple extends Fruit{

    @Override
    public void makeJuice() {
        System.out.println("Apple Juice was made here");
    }

    public void removeSeeds(){
        System.out.println("remove apple seeds");
    }

    public String calories(){
        calories = "500cal";
        return calories;
    }
}
