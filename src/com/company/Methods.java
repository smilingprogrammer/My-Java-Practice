package com.company;

import java.util.Scanner;

public class Methods {

    static double perMinuteCharge = 0.25;
    static int taxPercentage = 15/100;
    static double overPlan = 17;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]){
//
//        System.out.println("Enter your name");
//        Scanner scanner = new Scanner(System.in);
//        String outputName = scanner.next();
//        myName(outputName);

//        System.out.println("Enter the amount made:");
//        Scanner scanner = new Scanner(System.in);
//        int amountMade = scanner.nextInt();
//        System.out.println("Input your credit score");
//        int creditScore = scanner.nextInt();
//        scanner.close();
//
//        if (amountMade > 25000 && creditScore >= 700){
//            System.out.println("Your have been approved");
//        } else {
//            System.out.println("You are rejected");
//        }
        calculateTax();
        calculateOverage();
    }
    public static void calculateTax(){
        System.out.println("Enter your cell phone bill:");
        double cellPhoneBill = scanner.nextInt();
        double total = cellPhoneBill * taxPercentage;
        System.out.println("Your tax is" + total);
    }

    public static void calculateOverage(){
        System.out.println("Enter the number of minutes used:");
        double overPlanInput = scanner.nextDouble();
        double total = overPlanInput * overPlan;
        if (overPlanInput > overPlan){
            System.out.println(total);
        } else {
           System.out.println("You didn't user Over time");
        }
    }



}
