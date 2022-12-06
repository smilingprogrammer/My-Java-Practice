package com.company.polymorphism;

public class Banana extends Fruit{

    @Override
    public void makeJuice() {
        System.out.println("Banana juice was made here");
    }

    public void peel(){
        System.out.println("Peel the banana");
    }

    public String calories(){
        calories = "300cal";
        return calories;
    }

}
