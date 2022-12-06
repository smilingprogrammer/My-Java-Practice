package com.company.polymorphism;

public class Fruit {

    String calories;

    public String getCalories() {
        return calories;
    }

    public void setCalories(String calories) {
        this.calories = calories;
    }

    public void makeJuice(){
        System.out.println("Juice is made");
    }
}
