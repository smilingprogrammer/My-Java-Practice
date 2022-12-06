package com.company.polymorphism;

public class Banana extends Fruit{

    @Override
    public void makeJuice() {
        System.out.println("Banana juice was made here");
    }

    public void peel(){
        System.out.println("Peel the banana");
    }

    @Override
    public void setCalories(String calories) {
        System.out.println("Calories of banana is " + calories);
    }

}
