package com.company;

import java.util.Scanner;

public class Methods {

    public static void main(String args[]){
//
//        System.out.println("Enter your name");
//        Scanner scanner = new Scanner(System.in);
//        String outputName = scanner.next();
//        myName(outputName);

        System.out.println("Enter the amount made:");
        Scanner scanner = new Scanner(System.in);
        int amountMade = scanner.nextInt();
        System.out.println("Input your credit score");
        int creditScore = scanner.nextInt();
        scanner.close();

        if (amountMade > 25000 && creditScore >= 700){
            System.out.println("Your have been approved");
        } else {
            System.out.println("You are rejected");
        }
    }

//    public static void myName(String name){
//
//        System.out.println("My name is :" + name);
//    }

}
